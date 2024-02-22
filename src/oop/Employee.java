package oop;

public class Employee {
    private String name;

    //A class can change the data type of a fields, and  a users of the class
    // do not need to change any of  their code

    // private String address;
    private StringBuilder address; //change from String to StringBuilder
    private String jobTitle;
    private double salary;
    private int years;

    public String getName(){
        return name;
    }
    public String getJobTitle(){
        return jobTitle;
    }

    public double getsalary(){
        return salary;
    }

    public double getYears(){
        return years;
    }

    public String getAddress() {

        return address.toString(); //modify StringBuilder to String
    }

    public void setAddress(String address) {
         this.address = new StringBuilder(address); //modify from String to StringBuilder
    }

    public void setName(String name){
        this.name = name;

    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setYears(int years){
        this.years = years;
    }

    Employee(String name, String jobTitle, int salary, int years) { //constructor
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.years = years;
    }
    Employee(){

    }

    public double calculateSalary() {
        switch (years) {
            case 1 -> salary = salary * 1.5;
            case 2, 3, 4 -> salary = salary * 2;
            case 5 -> salary = salary * 2.8;
        }
        return salary;
    }

    public double updateSalary() {
        return salary + 300;

    }

    public void employeeInfo() {
        System.out.println(name + " " + jobTitle + " " + salary + " " + years);

    }
}
