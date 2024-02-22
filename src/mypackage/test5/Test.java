package mypackage.test5;

public class Test {
    public static void main(String[] args) {
        Animal animal; //Create the object for Child with Parent reference
        animal = new Parrot();
        animal.setName("Gosha");
        animal.setAge(2);
        animal.setWeight(0.5);
        animal.setHomeAnimal(true);
        animal.methodMove();
        animal.getInfo();
        animal.eats();
        if(animal.isHomeAnimal()) {
            System.out.println("If animal is pet you can bring him home");
        }else {
            System.out.println("If animal is not pet you must leave him free");
        }

        animal = new Raccoon();
        animal.setName("nameless animal");
        animal.setAge(5);
        animal.setWeight(10.5);
        animal.setHomeAnimal(false);
        animal.methodMove();
        animal.getInfo();
        animal.eats();
        if(animal.isHomeAnimal()) {
            System.out.println("If animal is pet you can bring him home");
        }else {
            System.out.println("If animal is not pet you must leave him free");
        }











    }

}
