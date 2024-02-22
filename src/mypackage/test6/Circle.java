package mypackage.test6;

class Circle extends Shape{
    double radius;

    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public String toString() {
        return "Circle color is " + super.getColor() + " " + "and area is : " + area();
    }

    @Override
    public void resize(double percentage) {
           radius*=percentage;
    }

    @Override
    public void draw() {

        //int radius = 8; // Radius of the circle
        int centerX = 10; // X coordinate of the center
        int centerY = 10; // Y coordinate of the center

        // Loop through each row
        for (int y = 0; y <= 2 * radius; y++) {
            // Loop through each column
            for (int x = 0; x <= 2 * radius; x++) {
                // Calculate distance of current point (x, y) from center
                double distance = Math.sqrt(Math.pow(x - 10, 2) + Math.pow(y - 10, 2));

                // If distance is approximately equal to radius, print *
                if (Math.abs(distance - radius) < 0.5) {
                    System.out.print("*");
                } else {
                    // Otherwise, print a space
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row is printed
            System.out.println();
        }

    }




}
