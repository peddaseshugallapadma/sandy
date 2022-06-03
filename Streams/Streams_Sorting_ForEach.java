package Java_Course.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Streams_Sorting_ForEach {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Scala");
        languages.add("Basic Courses");

        // Example 1 
        List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());
        System.out.println("Languages sorted alphabetically: " + sortedList);

        System.out.println("Printing all elements one by one: ");
        languages.stream().forEach(order -> System.out.println("Element is: " + order));

        // OR
        
        // languages.stream().forEach(order -> {
        // System.out.println("Element is: " + order);
        // });
    }
}