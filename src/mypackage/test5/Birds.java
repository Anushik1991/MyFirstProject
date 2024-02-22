package mypackage.test5;

public class Birds extends Animal{

    public Birds(String name, double weight, int age, boolean isHomeAnimal) {
        super(name, weight, age, isHomeAnimal);
    }

    public Birds() {
    }

    @Override
    void methodMove() {
        System.out.println("A birds fly, move on hind legs and swim");
    }

}
