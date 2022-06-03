package Java_Course.Streams;

import java.util.ArrayList;
import java.util.List;

public class Streams_Reduce {
    public static void main(String[] args) {
        // Demonstration of reduce method:

        // Identify - An element that is the initial value of the reduction operations
        // and the default result if the stream is empty.

        // Accumulator - A function that takes two parameters:
        // A partial result of the reduction operation and the next element of the
        // stream.

        // Combiner - A function used to combine the partial result of the reduction
        // operation
        // when the reduction is the parallelized, or when there's a mistake between the
        // types of the accumulator
        // arguments and the types of the accumulator implementation.

        List<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);

        int sum = num.stream().reduce(0, (ans, i) -> ans + i);

        System.out.println("Sum of all elements in the num: " + sum);
    }
}