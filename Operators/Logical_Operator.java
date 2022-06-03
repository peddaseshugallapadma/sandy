package Java_Course.Operators;

public class Logical_Operator {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;

        if ((value1 == 3) && (value2 == 2)) {
            System.out.println("value1 is 1 AND  value2 is 2"); // 2 conditions false
        }
        if ((value1 == 1) || (value2 == 5)) {
            System.out.println("value1 is 1 OR  value2 is 1");
        }

        // int value1 = 1;
        // int value2 = 2;
        // int result;
        // boolean someCondition = true;
        // result = someCondition ? value1 : value2;
        // System.out.println(result);
    }
}