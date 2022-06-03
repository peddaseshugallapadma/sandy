package Java_Course.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Streams_Filtering {
    public static void main(String[] args) {
        List<String> lang = new ArrayList<>();
        lang.add("Java");
        lang.add("Python");
        lang.add("Scala");

        // Example 1
        List<String> filterResult = new ArrayList<>();
        for (String string : lang) {
            if (string.startsWith("P")) {
                filterResult.add(string);
            }
        }
        System.out.println("Language Starts with 'P': " + filterResult);

        // Example 2
        List<String> filterResult1 = lang.stream().filter(string -> string.startsWith("S")).collect(Collectors.toList());
        System.out.println("Language Starts with 'S': " + filterResult1);
    }
}