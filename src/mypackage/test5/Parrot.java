package mypackage.test5;

public class Parrot extends Birds{

    public Parrot(String name, double weight, int age, boolean isHomeAnimal) {
        super(name, weight, age, isHomeAnimal);
    }

    public Parrot() {
    }

    @Override
    public void getInfo() {
        System.out.println("Parrot name - " + getName() + " " + "has" + " weight "
                + getWeight() + " and age " + getAge());
    }

    public void eats(){
        System.out.println("The parrot eat the different meal - fruits,cereals and vegetables");
    }



}


