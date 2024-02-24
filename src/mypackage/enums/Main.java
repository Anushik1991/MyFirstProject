package mypackage.enums;

public class Main {
    public static void main(String[] args) {

        //we cannot create an object from enumes
        //Seasons seasons = new Seasons();
        Seasons winter = Seasons.WINTER;
        Seasons summer = Seasons.SUMMER;

        System.out.println(winter);

        System.out.println(summer);

        Seasons seasons = Seasons.WINTER;

        switch (seasons){
            case AUTUMN -> System.out.println();
            case SUMMER -> System.out.println("It is hot");
            case WINTER -> System.out.println("It is cold");
            case SPRING -> System.out.println("It is beutiful");
        }
        seasons = Seasons.SUMMER;
        switch (seasons){
            case AUTUMN -> System.out.println();
            case SUMMER -> System.out.println("It is hot");
            case WINTER -> System.out.println("It is cold");
            case SPRING -> System.out.println("It is beutiful");
        }


        String winterCharacteristic = Seasons.WINTER.characteristic;
        System.out.println(winterCharacteristic);

        int summerNumber =  Seasons.SUMMER.number;
        System.out.println(summerNumber);

        int daysOfweak = Days.Monday.number;
        //System.out.println(daysOfweak);

        switch (daysOfweak){
            case 1 -> System.out.println("This is Monday, work day");
            case 2 -> System.out.println("This is Tuesday, work day");
            case 3 -> System.out.println("This is Wednesday, work day");
            case 4 -> System.out.println("It is Thursday, work day");
            case 5 -> System.out.println("It is Friday, work day");
            case 6 -> System.out.println("It is Saturday, free day");
            case 7 -> System.out.println("It is Sunday, free day");

        }

        Days mandayOfweak = Days.Monday;
        switch (mandayOfweak) {
            case Monday -> System.out.println("This work day");
            case Tuesday -> System.out.println("This is work day");
            case Wednesday -> System.out.println("This is work day");
            case Thursday -> System.out.println("It is work day");
            case Friday -> System.out.println("It is work day");
            case Saturday -> System.out.println("It is free day");
            case Sunday -> System.out.println("It is free day");

        }








    }
}
