package Java_Course.Access_Modifiers.Inheritance;
// concept of inheritance

// base class
public class Bicycle {
    // the Bicycle class has two fields
    protected int gear;
    protected int speed;

    // the Bicycle class has one constructor
    public Bicycle(int startGear, int startSpeed) {
        gear = startGear;
        speed = startSpeed;
    }

    // the Bicycle class has three methods
    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}