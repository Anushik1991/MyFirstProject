package mypackage.test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;
        System.out.println("What animal do you like: ");

        String animalName = scanner.next();
        if(animalName.equalsIgnoreCase("cat")) {
            animal = new Cat("Tom",5.6,3,9); //upcasting
        } else if (animalName.equalsIgnoreCase("dog")) {
            animal = new Dog("Spike",10.6,4,"brown");
        } else if (animalName.equalsIgnoreCase("jaguar")){
            animal = new Jaguar("Jag",100.6,4,7,false);
        } else {
            System.out.println("We dont have that animal " + animalName);
            System.out.println("We will create a generic animal");
            animal = new Animal("Jerry",3.4,4);
        }

         animal.makeSound();

        Dog dog = (Dog) animal; //downcasting
        System.out.println(dog.getBread());









    }
}
