package Java_Course.Collections.TreeSet;

import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {
        TreeSet<String> treeset = new TreeSet<>();

        treeset.add("B");
        treeset.add("A");
        treeset.add("D");
        treeset.add("C");

        System.out.println(treeset); // [A, B, C, D]
    }
}