package Java_Course.Streams.Streams_Practice;

import java.util.*;
import java.util.stream.IntStream;

public class Streams_Find {
    // Java code for Stream findAny()
    // which returns an Optional describing
    // some element of the stream, or an
    // empty Optional if the stream is empty.

    // Driver code
    public static void main(String[] args) {

        // Creating a List of Integers
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

        // Using Stream findAny() to return
        // an Optional describing some element
        // of the stream
        Optional<Integer> answer = list.stream().findAny();

        // if the stream is empty, an empty
        // Optional is returned.
        if (answer.isPresent()) {
            System.out.println(answer.get());
        } else {
            System.out.println("no value");
        }

        // Example 1
        // Creating a List of Strings
        List<String> list1 = Arrays.asList("Param", "for", "ParamQuiz", "SPS");

        // Using Stream findAny() to return
        // an Optional describing some element
        // of the stream
        Optional<String> answer1 = list1.stream().findAny();

        // if the stream is empty, an empty
        // Optional is returned.
        if (answer1.isPresent()) {
            System.out.println(answer1.get());
        } else {
            System.out.println("no value");
        }

        // Example 2
        // Creating an IntStream
        IntStream stream = IntStream.of(4, 5, 8, 10, 12, 16).parallel();

        // Using Stream findAny().
        // Executing the source code multiple times
        // may not return the same result.
        // Every time you may get a different
        // Integer which is divisible by 4.
        stream = stream.filter(i -> i % 4 == 0);

        OptionalInt answer2 = stream.findFirst();
        if (answer.isPresent()) {
            System.out.println(answer2.getAsInt());
        }
    }
}