package mypackage.test2;

public class Animal {
    private String name;
    private double weight;
    private int age;

    public Animal(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public Animal(String name) {
        this.name = name;
    }
    public Animal(double weight) {
        this.weight = weight;
    }

    public Animal(int age) {
        this.age = age;
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

    public void makeSound(){
        System.out.println("Animal makes a sound.");
    }
    public void eats(){
        System.out.println("Anumal eats");
    }




}
