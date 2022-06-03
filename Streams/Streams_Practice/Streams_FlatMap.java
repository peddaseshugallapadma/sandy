package Java_Course.Streams.Streams_Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_FlatMap {
    public static void main(String[] args) {
        // Stream flatMap(Function mapper) returns a stream consisting of the results of
        // replacing each element.
        // Creating a List of Strings
        List<String> list = Arrays.asList("5.6", "7.4", "4", "1", "2.3");

        // Using Stream flatMap(Function mapper)
        list.stream().flatMap(num -> Stream.of(num)).forEach(System.out::println);

        // Example 1: flatMap() function with provided operation of mapping string with
        // character at position 2.
        // Creating a List of Strings
        List<String> list1 = Arrays.asList("Param", "SPS", "ParameshSPS", "SPS");

        // Using Stream flatMap(Function mapper)
        list1.stream().flatMap(str -> Stream.of(str.charAt(2))).forEach(System.out::println);

        // Example 2
        // Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);

        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        System.out.println("The Structure before flattening is : " + listOfListofInts);

        // Using flatMap for transformating and flattening.
        List<Integer> listofInts = listOfListofInts.stream()
                .flatMap(list2 -> list2.stream())
                .collect(Collectors.toList());

        System.out.println("The Structure after flattening is : " + listofInts);
    }
}