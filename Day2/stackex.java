import java.util.Stack;

public class stackex {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10); // 0
        stack.push(15); // 1

        // System.out.println(stack.peek());
        // stack.pop();
        stack.forEach(System.out::println);
        
    }
}
