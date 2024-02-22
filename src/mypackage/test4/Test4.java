package mypackage.test4;

public class Test4 {
    public static void main(String[] args) {

       /* Subclass1 a1 = new Subclass1();
        a1.name = "Anton";
        a1.id = 111;
        a1.method();
        a1.print();
        System.out.println(a1.name + a1.id);

        Subclass2 a2 = new Subclass2();
        a2.name = "Anush";
        a2.method();
        a2.print();
        System.out.println(a2.name);

        */

        // Creating object of class 1
        Parent a;
        // Now we will be calling print methods
        // inside main() method

        a = new Subclass1();
        a.name = "GeeksforGeeks";
        //a.id = 1; //not access
        a.print();
        a.method();
        //a.getInfo();
        System.out.println(a.name);

        //a = new Subclass2();
        //a.print();
        //a.method();
        //a.name = "GeeksforGeeksfor";
        //System.out.println(a.name);

        Subclass1 b = (Subclass1)a;
        b.print();
        b.method();
        b.getInfo();
        b.name = "Arina";
        b.id = 333;
        System.out.println(b.name + b.id);









    }
}
