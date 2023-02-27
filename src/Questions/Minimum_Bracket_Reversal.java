package Questions;

import java.util.Stack;
//https://practice.geeksforgeeks.org/problems/count-the-reversals0401/1

public class Minimum_Bracket_Reversal {
    int countRev(String str) {
        if (str.length() % 2 == 1) return -1;

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '{') {
                st.push(ch);
            } else {
                if (!st.isEmpty() && st.peek() == '{') {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
        }

        int openBracket = 0;
        int closeBracket = 0;

        while (!st.isEmpty()) {
            if (st.peek() == '{') {
                openBracket++;
            } else {
                closeBracket++;
            }
            st.pop();
        }

        return (closeBracket + 1) / 2 + (openBracket + 1) / 2;
    }
}
