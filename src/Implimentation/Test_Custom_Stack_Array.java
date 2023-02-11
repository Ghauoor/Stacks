package Implimentation;

public class Test_Custom_Stack_Array {
    public static void main(String[] args) {
        Custom_Stack_Array stack = new Custom_Stack_Array(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.peek();
        stack.deleteStack();


    }
}
