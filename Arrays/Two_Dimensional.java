package Java_Course.Arrays;

public class Two_Dimensional {
    public static void main(String[] args) {
        int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.println(arr[1][1]); //6 -> 1st row, 1st column
    }
}