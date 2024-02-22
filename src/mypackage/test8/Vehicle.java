package mypackage.test8;

public abstract class Vehicle{
    private int mileage;
    private String brand;

    private int years; //instance variable

    private String color; //instance variable

    public Vehicle(int mileage, String brand, int years, String color) {
        this.mileage = mileage;
        this.brand = brand;
        this.years = years;
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }





}
