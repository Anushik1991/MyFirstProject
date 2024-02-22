package mypackage.test2;

public class Cat extends Animal{
    private int numberOflives;

    public Cat(String name, double weight, int age, int numberOflives) {
        super(name, weight, age);
        this.numberOflives = numberOflives;
    }
    public int getNumberOflives() {
        return numberOflives;
    }
    public void setNumberOflives(int numberOflives) {
        this.numberOflives = numberOflives;
    }
    public void makeSound(){
        System.out.println("Cat meows");
        //System.out.println("Name of the cate is " + super.getName());
    }
    @Override
    public void eats() {
        System.out.println("Cats eats the milk");
    }
}
