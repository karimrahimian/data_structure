package monj.Stack_test;

public class stack_test {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        int data = stack.pop();
        System.out.println(data);
        data = stack.pop();
        System.out.println(data);
        try {
            data = stack.pop();
            System.out.println(data);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
