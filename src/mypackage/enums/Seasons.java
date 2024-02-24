package mypackage.enums;

public enum Seasons {

    // winter, .... - object

    WINTER("Snowing",1), SPRING("Flowwing",2),
    SUMMER("Resting",3), AUTUMN("Falling",4);

   // WINTER("Skiing",11); we cannot use duplicate the values

    String characteristic;
    int number;
    Seasons(String characteristic, int number) {
        this.characteristic = characteristic;
        this.number = number;

    }






}
