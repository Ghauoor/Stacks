package Implimentation;

import java.util.ArrayList;

public class Custom_Stack_ArrayList {
    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty() {
        return list.size() == 0;
    }

    public static void push(int val) {
        list.add(val);
    }

    public static int pop() {
        if (isEmpty()) {
            return -1;
        }

        int top = list.get(list.size() - 1);
        list.remove(top);
        return top;
    }

    public static int peek() {
        if (isEmpty()) {
            return -1;
        }
        return list.get(list.size() - 1);
    }
}
