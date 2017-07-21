package tests;

import java.util.Stack;

public class PostfixTest {

    public static void main(String[] args) {

        System.out.println(infixToPostFix("(a+b*(c^b))/c-(b*a)"));



    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '(' || ch == ')';
    }

    private static boolean isOperand(char ch) {

        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    private static int getPrecedence(char ch) {

        switch (ch) {

            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

        }
        return -1;
    }

    public static String infixToPostFix(String infix) {

        Stack<Character> operators = new Stack<>();
        StringBuffer postFix = new StringBuffer();

        char ch;

        for (int i = 0; i < infix.length(); i++) {

            ch = infix.charAt(i);

            if (isOperand(ch)) {
                postFix.append(ch);
            }

            else if (ch == '(') {
                operators.push(ch);
            }

            else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    postFix.append(operators.pop());
                }

                if (!operators.isEmpty()) {
                    operators.pop();
                }
            }

            else if (isOperator(ch)) {
                if (!operators.isEmpty() && getPrecedence(ch) <= getPrecedence(operators.peek())) {
                    postFix.append(operators.pop());
                }
                operators.push(ch);
            }
        }
        while (!operators.isEmpty()) {
            postFix.append(operators.pop());
        }

        return postFix.toString();
    }
}


















