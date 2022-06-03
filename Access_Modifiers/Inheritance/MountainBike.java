package Java_Course.Access_Modifiers.Inheritance;

public class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int startGear, int startSpeed, int startHeight) {
        super(startGear, startSpeed);
        this.seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
