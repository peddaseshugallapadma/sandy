package Java_Course.Access_Modifiers.Interface;

public class Interface_Test {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(1, 10, 20);

        System.out.println("Gear is: " + mountainBike.getGear());
        System.out.println("Seat height is: " + mountainBike.getSeatHeight());
        System.out.println("Bike speed is: " + mountainBike.getSpeed());

        mountainBike.applyBrake(4);
        System.out.println("Bike speed is after applying break is: " + mountainBike.getSpeed());

        mountainBike.speedUp(10);
        System.out.println("Bike new speed is after increment is: " + mountainBike.getSpeed());
    }
}