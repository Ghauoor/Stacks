package Questions;

import java.util.Stack;

public class Reverse_String {
    public String reverse(String S) {

        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            stack.push(ch);
        }

        while (!stack.isEmpty()) {
            str.append(stack.peek());
            stack.pop();
        }

        return str.toString();
    }
}
