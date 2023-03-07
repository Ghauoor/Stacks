package Questions;

import java.util.Stack;

public class Special_Stack {
    // Define the data members.
    Stack<Integer> s = new Stack<>();
    int mini = Integer.MAX_VALUE;

    /*----------------- Public Functions of SpecialStack -----------------*/

    void push(int data) {
        //for first element
        if (s.isEmpty()) {
            s.push(data);
            mini = data;
        } else {
            if (data < mini) {
                int val = 2 * data - mini;
                s.push(val);
                mini = data;
            } else {
                s.push(data);
            }
        }
    }

    int pop() {
        // Implement the pop() function.
        if (s.isEmpty()) {
            return -1;
        }
        int curr = s.peek();
        s.pop();
        if (curr > mini) {
            return curr;
        } else {
            int prevMin = mini;
            int val = 2 * mini - curr;
            mini = val;
            return prevMin;
        }
    }

    int top() {
        // Implement the top() function.
        if (s.isEmpty()) {
            return -1;
        }

        int curr = s.peek();

        if (curr < mini) {
            return mini;
        } else {
            return curr;
        }
    }

    boolean isEmpty() {
        // Implement the isEmpty() function.
        return s.isEmpty();
    }

    int getMin() {
        // Implement the getMin() function.
        if (s.isEmpty()) {
            return -1;
        }

        return mini;
    }
}
