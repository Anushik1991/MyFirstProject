package mypackage.test;

public class Investment {
    String name;
    int amount;
    float percentage;

    Investment (String name, int amount, float percentage){
        this.name = name;
        this.amount = amount;
        this.percentage = percentage;
    }
    public float calculateProfit(){
        return amount+=((amount*percentage)/100);
    }


}
