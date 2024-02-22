import java.util.Scanner;

public class LernSwitchCase {
    public static void main(String[] args) {
        int number;
        String question;
        Scanner in = new Scanner(System.in);
        /*
        String question = new String();
        Scanner in = new Scanner(System.in);
        while (!question.equals("yes")) {
            System.out.println("Please input the numbers 1-7 ");
            number = in.nextInt();
            if (number < 1 || number > 7) {
                System.out.println("This number is incorrectly");
            } else {
                switch (number) {
                    case 1 -> System.out.println("Monday");
                    case 2 -> System.out.println("Thuesday");
                    case 3 -> System.out.println("Wensday");
                    case 4 -> System.out.println("Thursday");
                    case 5 -> System.out.println("Friday");
                    case 6 -> System.out.println("Saturday");
                    case 7 -> System.out.println("Sunday");
                }
            }
            System.out.println("If you want exite type \"yes\"");
            question = in.next();
        }

         */
            do {
            System.out.println("Please input the numbers 1-7 ");
            number = in.nextInt();
            if (number < 1 || number > 7) {
                System.out.println("This number is incorrectly");
            } else {
                switch (number) {
                    case 1 -> System.out.println("Monday");
                    case 2 -> System.out.println("Thuesday");
                    case 3 -> System.out.println("Wensday");
                    case 4 -> System.out.println("Thursday");
                    case 5 -> System.out.println("Friday");
                    case 6 -> System.out.println("Saturday");
                    case 7 -> System.out.println("Sunday");
                }
            }
            System.out.println("If you want exite type \"yes\"");
            question = in.next();

        } while (!question.equals("yes"));
    }
}
