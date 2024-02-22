package mypackage.test3;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        super.setS(s);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 3.14*radius*radius;

    }
}
