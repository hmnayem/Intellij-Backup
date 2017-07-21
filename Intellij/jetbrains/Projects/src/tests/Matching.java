package tests;

import java.util.Stack;

public class Matching {

    public static void main(String[] args) {

        Stack<Character> brackets = new Stack<>();
        String text = ")(())";
        boolean isMatch = true;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                brackets.push('(');
            } else {
                if (!brackets.isEmpty()) {
                    if (brackets.peek() == '(') {
                        brackets.pop();
                    }
                } else {
                    isMatch = false; break;
                }
            }
        }

        if (brackets.isEmpty() && isMatch) {
            System.out.println("Match");
        } else {
            System.out.println("Not Match");

        }
    }
}
