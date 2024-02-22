package mypackage.test6;

import mypackage.test7.Drawable;
import mypackage.test7.Resizable;

public class Test {
    public static void main(String[] args) {
       /* Shape s1 = new Circle("Black",2.3);
        System.out.println(s1);
        s1.draw();
        //s1.message(); //default message
        Shape s2 = new Triangle("White",5,10);
        System.out.println(s2);
        s2.draw();
        Shape s3 = new Rectangle("Red",4,6);
        System.out.println(s3);
        s3.draw();
        */
        Drawable s;
        s = new Circle("Blcak",10);
        s.draw();

        Resizable s1;
        s1 = new Circle("Blcak",10);
        s1.resize(2);
        s.draw();
        System.out.println(s);
        System.out.println(s1);


        s = new Triangle("White",6,5);
        s.draw();

        s1 = new Triangle("White",6,5);
        s1.resize(2);
        s1.draw();
        System.out.println(s);
        System.out.println(s1);


        s = new Rectangle("Red",3,7);
        s.draw();

        s1 = new Rectangle("Red",3,7);
        s1.resize(3);
        s1.draw();
        System.out.println(s);
        System.out.println(s1);






    }

}
