package oop;

   public class Car {
    public static String brand; //class variable
    private String color; //instance variable

    private int years; //instance variable
       private int mileage;

    private boolean isCarBroken;

    public Car() {
        System.out.println("This is constructor");
        brand = "BMW";
        color = "black";
        years = 1999;
    }
    //parametrilize constructor
    public Car(String color,int years) {
        this.color = color;
        this.years = years;
    }
    public Car(int years) {
        this.years = years;
    }

    public Car(String color) {
        this(color,0,0,false);
        //this.color = color;
    }

       public Car(String color,int years,int mileage, boolean isCarBroken) {

           this(color, years); // this id constructor chaining
           //this.color = color;
           //this.years = years;
           this.mileage = mileage;
           this.isCarBroken = isCarBroken;
       }
       public String getColor() {
           return color;
       }

       public int getYears() {
           return years;
       }

       public int getMileage() {
           return mileage;
       }

       public boolean getIsCarBroken() {
           return isCarBroken;
       }

       public void setColor(String color) {
           this.color = color;
       }

       public void setYears(int years) {
           this.years = years;
       }

       public void setMileage(int mileage) {
           this.mileage = mileage;
       }

       public void setCarBroken(boolean carBroken) {
           isCarBroken = carBroken;
       }

       public void runSpead() {
        System.out.println("Car is running");

    }

    public void carInfo() {
        System.out.println("color is " + color);
        System.out.println("years is " + years);
        System.out.println("brand is " + brand);
    }










}
