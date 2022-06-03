package Java_Course.Streams.Streams_Practice;

import java.util.Arrays;
import java.util.List;

public class Streams_Sorted {
    public static void main(String[] args) {
        // Stream sorted() returns a stream consisting of the elements of this stream,
        // sorted according to natural order.
        // For ordered streams, the sort method is stable but for unordered streams, no
        // stability is guaranteed.

        // Creating a list of integers
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

        System.out.println("The sorted stream is 1: ");

        // displaying the stream with elements
        // sorted in natural order
        list.stream().sorted().forEach(System.out::println);

        // Example
        // Creating a list of strings
        List<String> list1 = Arrays.asList("Param", "For", "ParamQuiz", "ParamforParam", "SPS");
  
        System.out.println("The sorted stream 2: ");
  
        // displaying the stream with elements
        // sorted in their natural order
        list1.stream().sorted().forEach(System.out::println);
    }
}