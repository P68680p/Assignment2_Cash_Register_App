package com.example.assignment2_cash_register_app;

import java.util.Date;

public class HistoryItem extends InventoryItem{
    private Date datePurchase;

    //constructors
    HistoryItem() {}
    public HistoryItem(double price, int quantity, String description, Date datePurchase) {
        super(price, quantity, description);
        this.datePurchase = datePurchase;
    }

    //methods
    @Override
    public String toString() {
        return "HistoryOfPurchasing {" +
                " price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", description='" + getDescription() + '\'' +
                ", date=" + datePurchase +
                '}';    }
}
