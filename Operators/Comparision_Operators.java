package Java_Course.Operators;

public class Comparision_Operators {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;

        if (value1 == value2) {
            System.out.println("value1 == value2"); // false
        }
        if (value1 != value2) {
            System.out.println("value1 != value2"); // true
        }
        if (value1 > value2) {
            System.out.println("value1 > value2"); // false
        }
        if (value1 < value2) {
            System.out.println("value1 < value2"); // true
        }
        if (value1 <= value2) {
            System.out.println("value1 <= value2"); // true
        }
        if (value1 >= value2) {
            System.out.println("value1 <= value2"); // false
        }
    }
}