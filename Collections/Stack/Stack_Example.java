package Java_Course.Collections.Stack;

import java.util.Stack;

public class Stack_Example {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Paramesh");
        stack.push("Swetha");
        stack.push("Anantapur");

        System.out.println("Original Stack: " + stack);

        // stack.pop(); // Remove the last element

        // OR

        String poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);

        System.out.println("Now the stack looks like: " + stack);

        String peekElement = stack.peek();
        System.out.println("Top Element: " + peekElement);

        System.out.println("Now the stack looks like: " + stack);
    }
}