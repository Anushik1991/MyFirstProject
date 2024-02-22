package mypackage.test1;

public class Tricky {
    static int num;
    Tricky(int n) {
        num = n;
    }
    Tricky inc() {  //method with type Class
        Tricky temp = new Tricky(num + 10);
        return temp;
    }
}
class TrickyQuestion {
    public static void main(String s[]) {
        Tricky num1 = new Tricky(10);
        Tricky num2;
        num2 = num1.inc();
        System.out.print("The program will display the output as: ");
        System.out.print(num1.num + ",");
        System.out.print(num2.num + ",");
        num2 = num1.inc();
        System.out.print(num2.num);
    }
}
