import java.util.Scanner;

public class Condition1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num1,num2,num3;

        System.out.println("Input the 1st number: 25");
        num1 = in.nextInt();

        System.out.println("Input the 2st number: 78");
        num2 = in.nextInt();

        System.out.println("Input the 2st number: 87");
        num3 = in.nextInt();

        if (num1>num2 && num1>num3) {
            System.out.println("The greatest: " + num1);
        }else if (num2>num1 && num2>num3) {
            System.out.println("The greatest: " + num2);
        }else if (num3>num1 && num3>num2) {
            System.out.println("The greatest: " + num3);
        }else {
            System.out.println("all numbers are equal to each other");
        }

        //while

        int countDown = 10;
        while (countDown >= 0) {
            System.out.println("До старта: " + countDown);
            countDown --;
        }
        System.out.println("Поехали !");

        int count = 1;
        while (true) {
            System.out.println("Строка №" + count);
            if (count > 3) {
                break;
            }

            count++; // Без наращивания цикл будет выполняться вечно
        }





    }
}
