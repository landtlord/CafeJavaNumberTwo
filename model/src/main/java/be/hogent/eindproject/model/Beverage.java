package be.hogent.eindproject.model;


public class Beverage {
    private final int beverageID;
    private final String beverageName;
    private final double price;

    public Beverage(int beverageID, String beverageName, double price) {
        this.beverageID = beverageID;
        this.beverageName = beverageName;
        this.price = price;
    }

    public int getBeverageID() {
        return beverageID;
    }

    public String getBeverageName() {
        return beverageName;
    }

    public double getPrice() {
        return price;
    }
}
