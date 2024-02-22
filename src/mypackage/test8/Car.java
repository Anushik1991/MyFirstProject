package mypackage.test8;

   public class Car extends Vehicle{

    private boolean isCarBroken;

       public Car(int mileage, String brand, int years, String color, boolean isCarBroken) {
           super(mileage, brand, years, color);
           this.isCarBroken = isCarBroken;
       }

       public boolean isCarBroken() {
           return isCarBroken;
       }

       public void setCarBroken(boolean carBroken) {
           isCarBroken = carBroken;
       }

       public void carInfo() {
        System.out.println("color is " + super.getColor());
        System.out.println("years is " + super.getYears());
        System.out.println("brand is " + super.getBrand());

    }










}
