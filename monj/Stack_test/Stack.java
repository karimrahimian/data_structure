package monj.Stack_test;

public class Stack {
    private final int Size = 10;
    private int stack[] ;
    private int top;

    public Stack(){
        top = -1;
        stack = new int[Size];
    }
    public boolean isFull(){
        return top+1 >= Size;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void push(int data){
        if (!isFull())
            stack[++top] = data;
    }
    public int pop(){
        if (!isEmpty())
            return stack[top--];
        throw new RuntimeException("Stack underflow");
    }
}
