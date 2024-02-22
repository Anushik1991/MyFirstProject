package mypackage.test6;

import mypackage.test7.Drawable;

public class Triangle extends Shape {
    private double base;
    private double height;

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle color is " + super.getColor() + " " + "and area is : " + area();
    }

    @Override
    public void draw() {
        // Draw the triangle
        for (int i = 0; i < base; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
        for (int i = (int)base - 1; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    }

    @Override
    public void resize(double percentage) {
        base *= percentage;
        height *= percentage;
    }
}
