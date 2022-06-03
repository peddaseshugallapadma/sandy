package Java_Course.Streams.Streams_Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Streams_ForEach {
    public static void main(String[] args) {
        // Stream forEach(Consumer action) performs an action for each element of the
        // stream.
        // Stream forEach(Consumer action) is a terminal operation.

        // Creating a list of Integers
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

        // Using forEach(Consumer action) to
        // print the elements of stream
        // in reverse order
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // Example 1
        // Creating a list of Strings
        List<String> list1 = Arrays.asList("SPS", "Param", "for", "ParamForParam");

        // Using forEach(Consumer action) to
        // print the elements of stream
        list1.stream().forEach(System.out::println);

        // Example 2
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("SPS", "Param", "for", "ParamForParam");

        // Using forEach(Consumer action) to print
        // Character at index 1 in reverse order
        stream.sorted(Comparator.reverseOrder())
                .flatMap(str -> Stream.of(str.charAt(1)))
                .forEach(System.out::println);
    }
}