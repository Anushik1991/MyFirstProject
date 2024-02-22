package mypackage.test3;

public class Main {
    public static void main(String[] args) {
        Circle area1 = new Circle(4);
        System.out.println(area1.getArea());

        Rectangle area2 = new Rectangle(3,4);
        System.out.println(area2.getArea());

        Triangle area3 = new Triangle(6,8);
        System.out.println(area3.getArea());
    }
}
