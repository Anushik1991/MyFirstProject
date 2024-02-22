package oop.inheritance;

public class JuniorProgramer extends Programer {
    boolean islearn;

    public JuniorProgramer(String name, String jobTitle, int salary, int years, String[] programerlanguages, boolean islearn) {
        super(name, jobTitle, salary, years, programerlanguages);
        this.islearn = islearn;
    }
    public void lern() {
        if(islearn) {
            System.out.println("The junior is lerning");

        }else {
            System.out.println("The junior is not lerning");
        }
    }



}
