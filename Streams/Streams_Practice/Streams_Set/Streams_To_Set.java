package Java_Course.Streams.Streams_Practice.Streams_Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Stream collect() method takes elements from a stream and stores them in a collection
// .collect(Collector.toSet()) collects elements from a stream to a Set.

public class Streams_To_Set {
    public static void main(String[] args) {
        // Creating a Stream of Integers
        Stream<Integer> stream = Stream.of(-2, -1, 0, 1, 2);

        // Using Stream.collect() to collect the
        // elements of stream in a container.
        Set<Integer> streamSet = stream.collect(Collectors.toSet());

        // Displaying the elements
        streamSet.forEach(num -> System.out.println(num));

        // Example 1
        // Creating a Stream of Strings
        Stream<String> streams = Stream.of("P", "A", "R", "A", "M");

        // Converting Stream into an Array
        String[] arr = streams.toArray(String[]::new);

        // Creating a HashSet
        Set<String> set = new HashSet<>();

        // Converting Array to set
        Collections.addAll(set, arr);

        // Displaying the elements
        set.forEach(str -> System.out.println(str));

        // Example 2
        // Creating a Stream of Integers
        Stream<Integer> stream1 = Stream.of(5, 10, 15, 20, 25);

        // Creating a HashSet
        Set<Integer> set1 = new HashSet<>();

        // using set.add() to add elements
        // of stream into empty set
        stream1.forEach(set1::add);

        // Displaying the elements
        set1.forEach(num -> System.out.println(num));
    }
}