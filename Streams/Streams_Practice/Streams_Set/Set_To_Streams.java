package Java_Course.Streams.Streams_Practice.Streams_Set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

// Set interface extends Collection interface and Collection has stream() method 
// that returns a sequential stream of the collection.

public class Set_To_Streams {
    public static void main(String[] args) {
        // Creating an Integer HashSet
        Set<Integer> set = new HashSet<>();

        // adding elements in set
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(8);
        set.add(10);
        set.add(12);

        // converting Set to Stream
        Stream<Integer> stream = set.stream();

        // displaying elements of Stream using lambda expression
        // stream.forEach(elem -> System.out.print(elem + " "));
        stream.forEach(elem -> System.out.print(elem + " " + "\n" ));

        // Example
        // Creating an String HashSet
        Set<String> sets = new HashSet<>();

        // adding elements in set
        sets.add("Param");
        sets.add("for");
        sets.add("ParamQuiz");
        sets.add("ParamforParam");

        // converting Set to Stream
        Stream<String> streams = sets.stream();

        // displaying elements of Stream
        streams.forEach(elem -> System.out.print(elem + " "));
    }
}