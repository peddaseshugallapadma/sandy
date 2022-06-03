package Java_Course.Control_Statements;

public class Ternary_Operator {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int result;

        result = a < b ? a : b;

        // if (a < b) {
        // result = a;
        // } else {
        // result = b;
        // }

        System.out.println(result);
    }
}