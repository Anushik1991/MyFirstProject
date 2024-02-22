import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a positive integer");
        num = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
              }











    }

}
