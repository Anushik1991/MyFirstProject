package mypackage.test7;

public class Spacecraft implements Flyable,Drawable{
    int speed;

    @Override
    public void fly() {

    }

    @Override
    public double getFlyspeed() {
        return 1000;
    }

    @Override
    public void draw() {
        int size = 5; // Adjust size as needed
        // Draw the top part of the spacecraft
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Draw the middle part of the spacecraft
        for (int i = 0; i < size / 2; i++) {
            System.out.print(" ");
            for (int j = 0; j < size * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Draw the bottom part of the spacecraft
        for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j < size * 2 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
