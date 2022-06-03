package Java_Course.Arrays;

public class Array {
    public static void main(String[] args) {
        // Declare an array of integers
        int[] anArray;

        // Allocation memory for 5 integers
        anArray = new int[5];

        // Initialize first element
        anArray[0] = 100;
        // Initialize second element
        anArray[1] = 200;
        // ans so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]); 
        System.out.println("Element at index 2: " + anArray[2]); 
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]); 
    }
}