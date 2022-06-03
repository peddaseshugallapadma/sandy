package Java_Course.Streams.Streams_Practice;

import java.util.*;

public class Streams_Count {
    public static void main(String[] args) {
        // Array count
        System.out.println("Array Count: ");
        List<Integer> list4 = Arrays.asList(0, 2, 4, 6, 8, 10, 12);

        long total = list4.stream().count();

        System.out.println("Array Count is: " + total);

        // Distinct Count
        System.out.println("\nDistinct Count: ");
        List<String> list5 = Arrays.asList("SPS", "Param", "for", "Param", "ParameshSPS", "SPS");

        long total1 = list5.stream().distinct().count();
        long total2 = list5.stream().count();

        System.out.println("Distinct Count: " + total1);
        System.out.println("Count: " + total2);
    }
}