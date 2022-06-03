package Java_Course.Streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;

public class Streams_Filtre {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Example 1 (Filtre)
        Set<Integer> squSet = new HashSet<>();
        for (Integer i : list) {
            squSet.add(i * i);
        }
        System.out.println("List of squared numbers: " + squSet);

        // Example 2
        Set<Integer> squSet1 = list.stream().map(s -> s * s).collect(Collectors.toSet());
        System.out.println("List of squared numbers: " + squSet1);
    }
}