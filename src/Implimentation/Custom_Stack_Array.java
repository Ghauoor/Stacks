package Implimentation;

public class Custom_Stack_Array {
    int[] arr;
    int topOfStack;

    public Custom_Stack_Array(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack is Created with size of " + size);
    }

    //IsEmpty

    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }

    //isFull
    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            // System.out.println("Stack is Full");
            return true;
        } else {
            return false;
        }
    }

    //Push
    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack is Already Full");
        } else {
            arr[topOfStack + 1] = val;
            topOfStack++;
            System.out.println("Value is Inserted " + val);
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");

        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            System.out.println("Pop val is " + topStack);
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("This Stack is Empty");
        } else {
            System.out.println("Peek Element of Stack is " + arr[topOfStack]);
        }
    }

    //Delete

    public void deleteStack() {
        arr = null;
        System.out.println("The Stack is deleted");
    }

}
