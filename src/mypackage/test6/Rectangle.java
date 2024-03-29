package mypackage.test6;

public class Rectangle extends Shape{

    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    double area() {
        return length*width;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String toString() {
        return "Rectangle color is " + super.getColor() + " " + "and area is : " + area();
    }

    @Override
    public void resize(double percentage) {
        width *= percentage;
        length *= percentage;
    }

    @Override
    public void draw(){
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }




}
