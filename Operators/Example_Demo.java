package Java_Course.Operators;

public class Example_Demo {
    public static void main(String[] args) {
        int s = 4;
        s++; // first assign, later increment
        // prints 5
        System.out.println(s);
        ++s; // first increment, later assign
        // prints 6
        System.out.println(s);
        // prints 7
        System.out.println(++s);
        // prints 7
        System.out.println(s++);
        // print 8
        System.out.println(s);
    }
}