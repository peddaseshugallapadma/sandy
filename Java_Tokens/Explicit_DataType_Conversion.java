package Java_Course.Java_Tokens;

public class Explicit_DataType_Conversion {
    public static void main(String[] args) {
        double a = 100.100;
        System.out.println("Double Representation: " + a);

        float f = (float)a;
        System.out.println("Float Representation: " + f);

        long b = (long)a;
        System.out.println("Long Representation: " + b); 

        int c = (int)b;
        System.err.println("Int representation: " + c);
    }
}