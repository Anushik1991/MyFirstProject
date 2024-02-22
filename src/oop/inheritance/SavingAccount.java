package oop.inheritance;

public class SavingAccount extends Account {
     private float rate;

     public float getRate() {
          return rate;
     }

     public void setRate(float rate) {
          this.rate = rate;
     }

     public SavingAccount(String userName, String surName, int accountNumber, float rate) {
          //super(userName, surName, accountNumber); // invoke the constructor of the parent
           super.setAccountNumber(accountNumber); // invoke the method of the parent
           super.setUserName(userName);
           super.setSurName(surName);
          this.rate = rate;
          System.out.println("This is child constructor");

     }
     public SavingAccount() {

     }
}
