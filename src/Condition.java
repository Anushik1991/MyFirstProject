import java.util.Scanner;
public class Condition {
    public static void main(String[]args) {
        String str1;
        int num1;
        Scanner in = new Scanner (System.in);
        System.out.println("Type in an integer: ");
        num1 = in.nextInt();
        System.out.println("Type in a line: ");
        str1 = in.next();
        System.out.println(str1 + " " + num1);

        int num2;
        System.out.println("Type in an number: ");
        num2 = in.nextInt();
        LernMethod.sign(num2);



    }





}



