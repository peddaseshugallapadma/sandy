package Java_Course.Control_Statements;

public class If_Else_Statements {
    public static void main(String[] args) {
        int testScore = 76;
        char Grade;

        if (testScore >= 90) {
            Grade = 'A';
        } else if (testScore >= 80) {
            Grade = 'B';
        } else if (testScore >= 70) {
            Grade = 'C';
        } else if (testScore >= 60) {
            Grade = 'D';
        } else {
            Grade = 'F';
        }

        System.out.println("Grade = " + Grade);
    }
}