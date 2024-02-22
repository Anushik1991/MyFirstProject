package mypackage.test5;

public class Mammals extends Animal{
    public Mammals(String name, double weight, int age, boolean isHomeAnimal) {
        super(name, weight, age, isHomeAnimal);
    }
    public Mammals() {
        super();
    }

    @Override
    void methodMove() {
        System.out.println("A Mammals move with paws and fins");
    }
    @Override
    public void getInfo() {
        super.getInfo();
    }
}
