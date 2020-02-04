package be.hogent.eindproject.model;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Order {
    private final int id;
    private final int orderNumber;
    private final Beverage beverage;
    private final int quantity;
    private final LocalDate date;
    private final Waiter waiter;

    public Order(int id, int orderNumber, Beverage beverage, int quantity, LocalDate date, Waiter waiter) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.beverage = beverage;
        this.quantity = quantity;
        this.date = date;
        this.waiter = waiter;
    }

}
