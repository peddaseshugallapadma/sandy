package Java_Training.Trainer_Aaryan.Java_Apr_22nd.Tasks;

public class Task2 {
    public static void checkForAdult(int age) {
        if (age >= 18) {
            System.out.println("Param is an Adult");
        }
        if (age < 18) {
            System.out.println("Azeez is not an Adult");
        }
    }

    public static void main(String[] args) {
        checkForAdult(12);
    }
}