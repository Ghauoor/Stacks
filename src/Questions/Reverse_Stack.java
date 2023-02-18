package Questions;

import java.util.Stack;

public class Reverse_Stack {

    private void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }

    private void reverse(Stack<Integer> stack) {
        //Base case
        if (stack.isEmpty()) return;

        //Store top element to push again
        int top = stack.pop();
        //recursive call
        reverse(stack);

        pushAtBottom(stack, top);
    }
}
