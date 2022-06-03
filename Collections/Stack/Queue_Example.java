package Java_Course.Collections.Stack;

import java.util.*;

public class Queue_Example {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("Paramesh");
        queue.add("Swetha");
        queue.add("America");

        System.out.println("Original Queue: " + queue); // Output is Alphabetic Order

        queue.remove();
        System.out.println("Queue after removing the head element: " + queue);

        String head = queue.peek();
        System.out.println("Head of the queue: " + head);

        head = queue.poll();
        System.out.println("Remove head: " + head);

        System.out.println("Queue now looks like this: " + queue);
    }
}