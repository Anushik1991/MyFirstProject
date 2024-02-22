package mypackage;

import mypackage.test7.Flyable;
import mypackage.test7.Pingvin;
import mypackage.test8.*;


public class Main {
    public static void main(String[] args) {
        Flyable vehicle;
        vehicle = new Helicopter(10,"mersendez",5,"white",true,4.5,10);

        Flyable bird;

        bird = new Pingvin("Pingvin","Arctica", 10, 1000);

        bird.fly();

        Bike bike = new Bike(10,"mersedes",10,"white","1",4);
        System.out.println( bike.getModel());













    }


}
