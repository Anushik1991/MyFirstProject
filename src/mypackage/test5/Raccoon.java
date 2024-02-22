package mypackage.test5;

public class Raccoon extends Mammals{
    public Raccoon(String name, double weight, int age, boolean isHomeAnimal) {
        super(name, weight, age, isHomeAnimal);
    }

    public Raccoon() {
    }

    @Override
    public void getInfo() {
            System.out.println("raccon name - " + getName() + " " + "has" + " weight "
                    + getWeight() + " and age " + getAge());
    }

    public void eats(){
        System.out.println("The raccon eat the different meal - fruits, vegetables,birds, bugs and an" + "other");}



}
