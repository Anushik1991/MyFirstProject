package mypackage.test5;

abstract public class Animal {
    private String name;
    private double weight;
    private int age;
    private boolean isHomeAnimal;

    public Animal(String name, double weight, int age, boolean isHomeAnimal) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.isHomeAnimal = isHomeAnimal;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHomeAnimal() {
        return isHomeAnimal;
    }

    public void setHomeAnimal(boolean homeAnimal) {
        isHomeAnimal = homeAnimal;
    }

    abstract void methodMove();

    public void eats(){
        System.out.println("A birds eat the fishes and bugs");
    }

    public void getInfo() {
        System.out.println("Animal name - " + getName() + " " + "has" + " weight "
                + getWeight() + " and age " + getAge());
    }



}
