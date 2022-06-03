package Java_Course.Collections.Hash_Set;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        // boolean r1 = hashSet.add("C");
        // System.out.println(r1); //True

        hashSet.add("C");
        // boolean r2 = hashSet.add("C");
        // System.out.println(r2); // False

        System.out.println(hashSet); // [A, B, C]

        System.out.println("List contains C or not? " + hashSet.contains("C"));

        hashSet.remove("A");

        System.out.println("Set after removing A: " + hashSet);

        for (String item : hashSet) {
            System.out.println(item);
        }
    }
}