package mypackage.test;

public class Main {
    public static void main(String[] args) {
        Mobile mobeen_mobile = new Mobile(1, "Nokia", "3412", 2.5);
        System.out.println("Converted Delimited Format is : " + convertToDelimitedFormat(mobeen_mobile));

    }

    public static String convertToDelimitedFormat(Mobile mobile) { //parametr type Class/object
        /*
        String delimiter = ",";
        StringBuilder delimitedString = new StringBuilder();
        delimitedString.append(mobile.numberOfSims).append(delimiter).append(mobile.maker).append(delimiter)
                .append(mobile.model).append(delimiter).append(mobile.cameraMegaPixels);
        return delimitedString.toString();
         */

        return String.join(",", String.valueOf(mobile.numberOfSims), //return String
                mobile.maker, mobile.model, String.valueOf(mobile.cameraMegaPixels));


    }

}
