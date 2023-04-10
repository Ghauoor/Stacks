package Questions;

import java.util.Stack;
//https://leetcode.com/problems/valid-parentheses/description/
public class Valid_Parentheses {
    public static void main(String[] args) {
        String str = "{()}";
        if (isValid(str)) {
            System.out.println("String is Valid");
        } else {
            System.out.println("String is InValid");
        }
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (!stack.isEmpty()) {
                    char top = stack.peek();
                    if ((ch == ')' && top == '(') ||
                            (ch == '}' && top == '{') ||
                            (ch == ']' && top == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    /*
     * #######################################################################
     * Same Approach but slightly diff style code
     * */
    public boolean isValidPara(String str) {
        Stack<Character> st = new Stack<>();

        for (char ch :
                str.toCharArray()) {
            if (st.isEmpty() || ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
                continue;
            }

            if (ch == ')') {
                if (st.peek() == '(')
                    st.pop();
                else
                    return false;

            } else if (ch == ']') {
                if (st.peek() == '[')
                    st.pop();
                else
                    return false;
            } else if (ch == '}') {
                if (st.peek() == '{')
                    st.pop();
                else
                    return false;
            }
        }

        return st.isEmpty();

    }
}
