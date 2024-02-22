package oop.inheritance;

public class Account {

    private String userName;

    private String surName;

    private int accountNumber;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Account(String userName, String surName, int accountNumber) {
        this.userName = userName;
        this.surName = surName;
        this.accountNumber = accountNumber;
        System.out.println("This is parent constructor");
    }

         public Account() {
        System.out.println("This is parent constructor without parameter");

    }


}
