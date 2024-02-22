package mypackage.test8;

import mypackage.test7.Flyable;

public class Helicopter extends Vehicle implements Flyable {
    private boolean isYesCamera;
    private double size;

    private double speed;

    public Helicopter(int mileage, String brand, int years, String color, boolean isYesCamera, double size, double speed) {
        super(mileage, brand, years, color);
        this.isYesCamera = isYesCamera;
        this.size = size;
        this.speed = speed;
    }

    public boolean isYesCamera() {
        return isYesCamera;
    }

    public void setYesCamera(boolean yesCamera) {
        isYesCamera = yesCamera;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void fly() {
        System.out.println("This apparat is flyable");

    }

    @Override
    public double getFlyspeed() {
        return 0;
    }
}
