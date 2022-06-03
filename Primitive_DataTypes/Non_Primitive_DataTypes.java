package Java_Course.Primitive_DataTypes;

public class Non_Primitive_DataTypes {
    public static void main(String[] args) {

        String str = "Test"; 
        System.out.println("String is: " + str);

        String str1 = new String("Test");
        System.out.println("Another String is: " + str1);

        int arr[];
        arr = new int[3];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        System.out.println(arr);
        System.out.println(arr[0]);
    }
}