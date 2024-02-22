package mypackage.test6;

import mypackage.test7.Resizable;

public abstract class Shape implements Resizable { //we can no use method from interface, but we nust implemented in subclass
    String color;

    public Shape (String color){
        System.out.println("Shape constructor called");
        this.color = color;
    }

    public String getColor(){ //concrete method
        return color;
    }

    abstract double area (); //abstract methods

    public abstract String toString(); //abstract methods










}
