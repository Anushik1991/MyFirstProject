package mypackage.test7;

public abstract class Bird implements Flyable,Printable {
    public String typeBird;
    public String areaLive;
    public int age;
    public int population;

    public Bird(String typeBird, String areaLive, int age, int population) {
        this.typeBird = typeBird;
        this.areaLive = areaLive;
        this.age = age;
        this.population = population;
    }

    @Override
    public void fly() {
        if(typeBird.equals("penguin")) {
            System.out.println("The bird doesnt fly");
        }else {
            System.out.println("The bird can fly");
        }
    }

    @Override
    public double getFlyspeed() {
        return 300;
    }

    @Override
    public void print() {
        System.out.println("This is bird");
    }

    @Override
    public void show() {

    }


}
