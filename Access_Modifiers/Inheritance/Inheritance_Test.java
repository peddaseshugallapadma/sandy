package Java_Course.Access_Modifiers.Inheritance;

public class Inheritance_Test {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(1, 10, 20);

        System.out.println("Gear is: " + mountainBike.gear);
        System.out.println("Seat height is: " + mountainBike.seatHeight);
        System.out.println("Bike speed is: " + mountainBike.speed);

        mountainBike.applyBrake(4);
        System.out.println("Bike speed is after applying break is: " + mountainBike.speed);
    }
}