package be.hogent.eindproject.model;


import lombok.Getter;

import java.util.Objects;

@Getter
public class Beverage {
    private final int beverageID;
    private final String beverageName;
    private final double price;

    public Beverage(int beverageID, String beverageName, double price) {
        this.beverageID = beverageID;
        this.beverageName = beverageName;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beverage beverage = (Beverage) o;
        return beverageID == beverage.beverageID &&
                Double.compare(beverage.price, price) == 0 &&
                Objects.equals(beverageName, beverage.beverageName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beverageID, beverageName, price);
    }
}
