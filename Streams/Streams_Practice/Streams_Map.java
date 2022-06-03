package Java_Course.Streams.Streams_Practice;

import java.util.*;
import java.util.stream.Collectors;

public class Streams_Map {
    public static void main(String[] args) {
        // Stream map(Function mapper) is an intermediate operation.
        // Stream map returns a stream consisting of the results of applying the given
        // function to the elements of this stream.

        System.out.println("The stream after applying " + "the function is : ");

        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);

        // Using Stream map(Function mapper) and
        // displaying the corresponding new stream
        System.out.println("Stream Map 1:-");
        list.stream().map(number -> number * 2).forEach(System.out::println);

        System.out.println("Stream Map 2:-");
        list.stream().map(x -> (x * x) / x).forEach(System.out::println);

        System.out.println("Stream Map 3:-");
        List<Integer> div = list.stream().map(x -> x / 2).collect(Collectors.toList());
        System.out.println(div);

        // Exampple 1  
        // Creating a list of Integers
        List<String> list1 = Arrays.asList("Param", "sps", "P", "a", "r", "a", "m");
  
        // Using Stream map(Function mapper) to convert the Strings in stream to UpperCase form
        List<String> answer = list1.stream().map(String::toUpperCase).collect(Collectors.toList());
  
        // displaying the new stream of UpperCase Strings
        System.out.println(answer);
        // [PARAM, SPS, P, A, R, A, M]

        // Example 2
        // Creating a list of Strings
        List<String> list2 = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ", "Computer", "Science", "gfg");
  
        // Using Stream map(Function mapper) and displaying the length of each String
        list2.stream().map(str -> str.length()).forEach(System.out::println);
    }
}