package Questions;

import java.util.Stack;

public class Push_At_Bottom_Of_Stack {
    public void pushAtBottom(int data, Stack<Integer> stack) {

        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int top = stack.pop();
        pushAtBottom(data, stack);

        stack.push(top);
    }
}
