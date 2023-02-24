package Questions;

import java.util.Stack;

public class Redundant_Bracket_Checker {
    public static boolean findRedundantBrackets(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '*' || ch == '-' || ch == '+' || ch == '/') {
                stack.push(ch);
            } else {
                if (ch == ')') {
                    boolean isRedundant = true;

                    while (stack.peek() != '(') {
                        char top = stack.peek();

                        if (top == '+' || top == '-' || top == '*' || top == '/') {

                            isRedundant = false;

                        }

                        stack.pop();
                    }

                    if (isRedundant) return true;
                    stack.pop();
                }
            }
        }

        return false;
    }
}
