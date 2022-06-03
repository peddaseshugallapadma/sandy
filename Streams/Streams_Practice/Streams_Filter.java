package Java_Course.Streams.Streams_Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams_Filter {
    // Stream filter(Predicate predicate) returns a stream consisting of the
    // elements of this stream that match the given predicate.

    // Main driver method
    public static void main(String[] args) {

        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

        // Getting a stream consisting of the
        // elements that are divisible by 5
        // Using Stream filter(Predicate predicate)
        list.stream()
                .filter(num -> num % 5 == 0)
                .forEach(System.out::println);

        // Example 1
        // Creating a stream of strings
        Stream<String> stream = Stream.of("Param", "fOr", "PARAMQUIZ", "ParamforParam");

        // Getting a stream consisting of the
        // elements having UpperCase Character
        // at custom index say be it '1'
        // using Stream filter(Predicate predicate)
        stream
                .filter(
                        str -> Character.isUpperCase(str.charAt(1)))
                .forEach(System.out::println);

        // Example 2
        // Creating a stream of strings
        Stream<String> streams = Stream.of("Param", "foR", "ParamQuiz", "ParamforParam");

        // Getting a stream consisting of the
        // elements ending with 's'
        // using Stream filter(Predicate predicate)
        streams.filter(str -> str.endsWith("m"))
                .forEach(System.out::println);
    }
}