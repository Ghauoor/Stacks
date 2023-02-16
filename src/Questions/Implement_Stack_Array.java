package Questions;
//https://practice.geeksforgeeks.org/problems/implement-stack-using-array/1

public class Implement_Stack_Array {
    int top;
    int arr[] = new int[1000];

    Implement_Stack_Array() {
        top = -1;
    }

    //Function to push an integer into the stack.
    void push(int a) {
        if (top == arr.length - 1) {
            return;
        }
        top++;
        arr[top] = a;
    }

    //Function to remove an item from top of the stack.
    int pop() {
        int a = -1;
        if (top <= -1)
            return -1;
        a = arr[top];
        top--;

        return a;
    }

    //Another Way
    void pushStack(int a) {
        arr[++top] = a;
    }

    //Function to remove an item from top of the stack.

    int popStack() {
        if (top == -1)
            return top;
        else
            return arr[top--];
    }
}
