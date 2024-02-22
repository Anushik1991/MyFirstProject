package mypackage.test7;

public class Helicopters implements Flyable, Drawable {
    int speed;
    @Override
    public void fly() {
        }

    @Override
    public double getFlyspeed() {
        return 200;
    }
    @Override
    public void draw() {
        int size = 8; // Size of the helicopter (adjust as needed)

        // Draw top part of the helicopter
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size * 2; j++) {
                if ((j >= size - i) && (j <= size + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Draw bottom part of the helicopter
        for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j < size * 4; j++) {
                if (j == 0 || j == size * 4 - 1) {
                    System.out.print("*");
                } else if ((j > 0 && j < size) || (j > size * 3 && j < size * 4 - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
