package Questions;

import java.util.Stack;

public class Sort_Stack {
    public Stack<Integer> sort(Stack<Integer> s) {
        if (s.isEmpty()) {
            return s;
        }

        int top = s.peek();
        s.pop();

        //recursive call
        sort(s);
        sortedInsert(s, top);

        return s;
    }

    private void sortedInsert(Stack<Integer> s, int num) {
        if (s.isEmpty() || (!s.isEmpty() && s.peek() < num)) {
            s.push(num);
            return;
        }

        int top = s.peek();
        s.pop();

        //recursive call
        sortedInsert(s, num);
        s.push(top);

    }
}
