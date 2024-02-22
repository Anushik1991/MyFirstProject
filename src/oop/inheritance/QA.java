package oop.inheritance;

public class QA extends Employee implements Printable,Info{
    private String[] testtedTools;

    public QA(String name, String jobTitle, int salary, int years, String[] testtedTools) {
        super(name, jobTitle, salary, years);
        this.testtedTools = testtedTools;
    }
    public void qaTesting () {
        System.out.println("i am testing the program");
    }

    @Override
    public void print() { //implement interface
        System.out.println("print");
    }
    @Override
    public void print1() { //implement interface
        System.out.println("print1");
    }
    @Override
    public String getInfo() { //implement interface
        return "QA class";
    }
}
