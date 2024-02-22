package oop.inheritance;

public class Programer extends Employee {
   private String[] programerlanguages;
   public Programer (String name,String jobTitle,int salary, int years, String[] programerlanguages){
       super(name,jobTitle,salary,years);
       this.programerlanguages = programerlanguages;
   }

   public void programerCoding () {
       System.out.println("i am coding the program");
   }




}
