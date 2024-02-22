package mypackage.test2;

public class Dog extends Animal {
    private String bread;
    public Dog(String name, double weight, int age, String bread) {
        super(name, weight, age);
        this.bread = bread;
    }
    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
        //System.out.println("Name of the dog is " + super.getName());
    }
    @Override
    public void eats() {
        System.out.println("Dogs eats ");
    }
}
