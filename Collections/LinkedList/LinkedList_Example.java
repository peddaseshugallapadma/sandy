package Java_Course.Collections.LinkedList;

import java.util.LinkedList;

public class LinkedList_Example {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("W");
        list.add("T");
        // System.out.println(list); // [W, T]

        list.addFirst("S");
        // System.out.println(list); // [S, W, T]

        list.addLast("A");
        // System.out.println(list); // [S, W, T, A]

        list.add(2, "E");
        // System.out.println(list); // [S, W, E, T, A]

        list.add(4, "H");

        System.out.println(list); // [S, W, E, T, H, A]

        list.remove(2);
        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }
}