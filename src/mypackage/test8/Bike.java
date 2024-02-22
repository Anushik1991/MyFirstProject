package mypackage.test8;

public class Bike extends Vehicle{
    private String model;
    private int cc;

    public Bike(int mileage, String brand, int years, String color, String model, int cc) {
        super(mileage, brand, years, color);
        this.model = model;
        this.cc = cc;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }



}