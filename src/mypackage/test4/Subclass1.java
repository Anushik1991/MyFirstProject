package mypackage.test4;

public class Subclass1 extends Parent{
    int id;
    void print() {
        System.out.println("subclass1");
    }

    @Override
    void method() {
        System.out.println("Method from Child1");
    }

    void getInfo(){
        System.out.println("We get info");
    }
}
