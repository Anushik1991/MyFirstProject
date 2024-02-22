package mypackage.test1;

public class Main {
    public static void main(String[] args) {
       // Counter c1 = new Counter();
       // Counter c2 = new Counter();
       // Counter c3 = new Counter();

        Counter1 cc1 = new Counter1();
        Counter1 cc2 = new Counter1();
        Counter1 cc3 = new Counter1();


        Student.change();

        Student s1 = new Student(111,"Karan");
        Student s2 = new Student(222,"Aryan");
        Student s3 = new Student(333,"Sonoo");
        //calling display method
        s1.display();
        s2.display();
        s3.display();


    }
}
