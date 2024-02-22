package oop.inheritance;

public class Main {
    public static void main(String[] args) {
        //Account account = new Account("Anush","Akopyan",123456);
        SavingAccount saving = new SavingAccount("Anush","Akopyan",123456,4f);
        saving.setSurName("Akop");
        saving.setRate(5f);

        String[] languages = {"Java","C#"};
        JuniorProgramer obj1 = new JuniorProgramer("Anush","Java programist",
                2000,2,languages,true );
                 obj1.lern();
                 obj1.programerCoding();
                 obj1.calculateSalary();





    }
}
