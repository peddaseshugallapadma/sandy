package Java_Course.Collections.ArrayList;

import java.util.*;

public class ArrayList_Example {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>(5);

        for (int i = 1; i <= 5; i++) {
            arrayList.add(i);
        }

        // Printing element
        System.out.println(arrayList);

        // Remove element at index 3
        arrayList.remove(3);

        // Displaying the ArrayList after deletion
        System.out.println(arrayList);

        // Printing element one by one
        // for (int index = 0; index < arrayList.size(); index++) {
        // System.out.println(arrayList.get(index) + " ");
        // }

        for (Integer index : arrayList) {
        System.out.println(index);
        }
    }
}