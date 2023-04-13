package Questions;

import java.util.Stack;

//https://leetcode.com/problems/validate-stack-sequences/description/
public class Validate_Stack_Sequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int poppedPointer = 0;
        for (int val :
                pushed) {
            st.push(val);

            while (!st.isEmpty() && st.peek() == popped[poppedPointer]) {
                st.pop();
                poppedPointer++;
            }
        }

        return st.isEmpty();
    }
}
