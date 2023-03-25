package Questions;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_Using_Queue {
    private Queue<Integer> queue;

    public Implement_Stack_Using_Queue() {
        queue = new LinkedList<>();
    }

    private void push(int val) {
        queue.add(val);
        int size = queue.size();

        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.peek());
            queue.remove();
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
