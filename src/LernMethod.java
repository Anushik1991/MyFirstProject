public class LernMethod {
    public static void main(String[] args) {
        greetingUsers();
        myName("Anush");
        myName("Stepan");
        myNameSurname("Anush","Akopyan");
        sign(1);
        sign(-10);
        sign(0);
        sign(-450);
        studentData("Anush","Akopyan",32,88.8);
        studentData("Stepan","",33,90);
        minNumber(1,3);
        minNumber(4,3);
        minNumber(4,4);
        minNumber(150,200);
        areaCircle(4);
        powerNumber(3,3);
        System.out.println(powerNumberF(2,4));
        isEven(5);
        gradesGet(3.3);
    }
    static void greetingUsers(){
        String start = "Hello World";
        System.out.println(start);
    }
    static void myName(String name){
        System.out.println("Hello " + name);
    }
    static void myNameSurname(String name,String surname){
        System.out.println("Hello " + name + surname);
    }
    static void sign (int n){
        if (n > 0) {
            System.out.println("the number is positiv");
        }
        if (n < 0) {
            System.out.println("the number is negativ");
        }
        if (n == 0) {
            System.out.println("the number is equal 0");
        }
    }
    static void studentData(String name,String surname, int age, double grade){
        System.out.println("Show the student data:" + name + " " + surname + " " + age + " " + grade);
    }
    static void minNumber(int x, int y) {

        if (x<y){System.out.println("Min number is = " + x);
        } else if (y<x){System.out.println("Min number is = " + y);
        } else {System.out.println("number1 = number2");
        }
    }

    public static void areaCircle(double r) {
        {
            System.out.println(3.14*(r*r));}
    }
    public static void powerNumber(double base,int ex) {
        {System.out.println(Math.pow(base,ex));}
    }
    public static double powerNumberF(double base,int ex) {
        double result = 1;
        for (double i = 1; i<=ex; i++) {
        result = result * base;
        }
        return result;
    }
    public static void isEven(int aa) {
        if (aa%2==0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static void gradesGet(double grade){
        if (grade >= 2.00 && grade <= 2.99) {
            System.out.println("fail");
        } else if (grade >= 3.00 && grade <= 3.49) {
            System.out.println("poor");
        } else if (grade >= 3.50 && grade <= 4.49) {
            System.out.println("good");
        } else if (grade >= 4.50 && grade <= 5.49) {
            System.out.println("very good");
        } else if (grade >= 5.50 && grade <= 6.00) {
            System.out.println("excellent");
        } else {
            System.out.println("You input the no valid data");
        }

    }


}
