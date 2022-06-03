package Java_Course.Streams.Streams_Practice;

import java.util.*;
import java.util.stream.Collectors;

public class Streams_Example {
    public static void main(String[] args) {
        // create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        // Map
        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);
        // [4, 9, 16, 25]

        // create a list of String
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

        // Filter
        // demonstration of filter method
        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);
        // [Stream]

        // Sorted
        // demonstration of sorted method
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);
        // [Collection, Reflection, Stream]

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2, 3, 4, 5);

        // Set
        // collect method returns a set
        Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(squareSet);
        // [16, 4, 9, 25]

        // ForEach
        // demonstration of forEach method
        number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

        // Reduce
        // demonstration of reduce method
        int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
        System.out.println(even);
        // 2 + 4 = 6
    }
}