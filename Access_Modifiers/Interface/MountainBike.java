package Java_Course.Access_Modifiers.Interface;

public class MountainBike implements Bicycle {
    private int seatHeight;
    private int gear;
    private int speed;

    public MountainBike(int startGear, int startSpeed, int startHeight) {
        seatHeight = startHeight;
        speed = startSpeed;
        gear = startGear;
    }

    @Override
    public void applyBrake(int decrease) {
        speed = speed - decrease;        
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;        
    }

    // Getters And Setters
    public String getGear() {
        return null;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
