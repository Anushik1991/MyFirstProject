package mypackage;

public interface Teststatic {
    static void getInfo() {
        System.out.println("this is static method");
    }

    private void getname(){
        System.out.println("this is sttaic method"); //we can use only for this interface
    }
}
