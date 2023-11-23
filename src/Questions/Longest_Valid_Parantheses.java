package Questions;

import java.util.LinkedList;
import java.util.Stack;

// https://leetcode.com/problems/longest-valid-parentheses/description/
public class Longest_Valid_Parantheses {

    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        int left = -1;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '(') stack.push(j);
            else {
                if (stack.isEmpty()) left = j;
                else {
                    stack.pop();
                    if (stack.isEmpty()) max = Math.max(max, j - left);
                    else max = Math.max(max, j - stack.peek());
                }
            }
        }
        return max;
    }

    public int longestValidParenthese(String s) {
        LinkedList<Integer> stack = new LinkedList<>();
        int result = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && stack.size() > 1 && s.charAt(stack.peek()) == '(') {
                stack.pop();
                result = Math.max(result, i - stack.peek());
            } else {
                stack.push(i);
            }
        }
        return result;
    }

}

