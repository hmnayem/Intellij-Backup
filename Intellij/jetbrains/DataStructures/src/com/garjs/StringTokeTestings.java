package com.garjs;

import java.util.EmptyStackException;
import java.util.Stack;
import java.util.StringTokenizer;

public class StringTokeTestings {

    public static void main(String[] args) throws Exception {

        String test = "a^b+c^d";

        if (parenthesisCheck(test)) {

            System.out.println(toPostfix(test));

            if (isComputable(toPostfix(test))) {

                System.out.println(computePostfix(toPostfix(test)));
            } else {
                System.out.println("Impossible to Solve");
            }
        }
        System.out.println(parenthesisCheck(test));
    }

    public static String toPostfix(String infix) throws Exception {

        try {
            String postfix = "";

            boolean unary = true;

            Stack<String> stack = new Stack<>();
            StringTokenizer st = new StringTokenizer(infix, "()+-/%*^ ", true);

            while (st.hasMoreTokens()) {
                String token = st.nextToken().trim();

                if (token.equals("")) {

                } else if (token.equals("(")) {
                    stack.push(token);
                } else if (token.equals(")")) {
                    String op;

                    while (!(op = stack.pop()).equals("(")) {
                        postfix += " " + op;
                    }
                } else if (token.equals("*")
                        ||
                        token.equals("+")
                        ||
                        token.equals("-")
                        ||
                        token.equals("/")
                        ||
                        token.equals("%")
                        ||
                        token.equals("^")) {
                    if (unary) {
                        token = "u" + token;
                        stack.push(token);
                    } else {
                        int p = operatorPrecedence(token);

                        while (!stack.isEmpty() && !stack.peek().equals("(") && operatorPrecedence(stack.peek()) >= p) {
                            String op = stack.pop();
                            postfix += " " + op;
                        }
                        stack.push(token);
                    }
                    unary = true;
                } else {
//                    Integer.parseInt(token);
                    postfix += " " + token;
                    unary = false;
                }

            }
            while (!stack.isEmpty()) {
                String op = stack.pop();
                postfix += " " + op;
            }

            return postfix;

        } catch (EmptyStackException e) {
            throw new Exception("Invalid Expression");
        }

    }

    private static int operatorPrecedence(String operator) {

        if (operator.equals("u-") || operator.equals("u+") || operator.equals("^")) {
            return 2;
        } else if (operator.equals("*") || operator.equals("/") || operator.equals("%")) {
            return 1;
        } else if (operator.equals("+") || operator.equals("-")) {
            return 0;
        }

        return -1;
    }

    private static void applyOperator(String operator, Stack<Integer> stack) {

        int op1 = stack.pop();

        if (operator.equals("u-")) {
            stack.push(-op1);
        } else if (operator.equals("u+")) {
            stack.push(op1);
        } else {
            int op2 = stack.pop();
            int result = 0;

            if (operator.equals("+")) {
                result = op2 + op1;
            } else if (operator.equals("-")) {
                result = op2 - op1;
            } else if (operator.equals("*")) {
                result = op2 * op1;
            } else if (operator.equals("/")) {
                result = op2 / op1;
            } else if (operator.equals("%")) {
                result = op2 % op1;
            } else if (operator.equals("^")) {
                result = (int) Math.pow(op2, op1);
            }
            stack.push(result);
        }
    }

    public static int computePostfix(String postfix) throws Exception {


            Stack<Integer> stack = new Stack<>();
            StringTokenizer st = new StringTokenizer(postfix);

            while (st.hasMoreTokens()) {
                String token = st.nextToken();

                if (token.equals("*")
                        ||
                        token.equals("+")
                        ||
                        token.equals("-")
                        ||
                        token.equals("/")
                        ||
                        token.equals("%")
                        ||
                        token.equals("u+")
                        ||
                        token.equals("u-")
                        ||
                        token.equals("^")) {
                    applyOperator(token, stack);

                } else {
                    stack.push(new Integer(token));
                }

            }
            int result = ((Integer) stack.pop()).intValue();

            return result;

    }

    private static boolean parenthesisCheck(String expression) {

        Stack<Character> stack = new Stack<>();

        for (Character ch : expression.toCharArray()) {

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty()) {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    private static boolean isComputable(String expression) {

        String test = expression.toUpperCase();
        for (int i=0; i<test.length(); i++) {
            if (test.charAt(i) >= 65 && test.charAt(i) <= 90) {
                return false;
            }
        }
        return true;
    }
}













