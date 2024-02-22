package mypackage.test2;

public class Jaguar extends Cat {
    private boolean isEndangered;
    public Jaguar(String name, double weight, int age, int numberOflives, boolean isEndangered) {
        super(name, weight, age, numberOflives);
        this.isEndangered = isEndangered;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }
}
