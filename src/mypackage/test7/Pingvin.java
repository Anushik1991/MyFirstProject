package mypackage.test7;

public class Pingvin extends Bird {


    public Pingvin(String typeBird, String areaLive, int age, int population) {
        super(typeBird, areaLive, age, population);
    }


    @Override
    public void fly() {
        System.out.println("Pingvin is not flyable");
    }
}
