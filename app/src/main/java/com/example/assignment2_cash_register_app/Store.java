package com.example.assignment2_cash_register_app;

import android.app.Application;

import java.util.ArrayList;
import java.util.Date;

public class Store extends Application {
    static InventoryItem[] inventory;   // inventory array
    ArrayList<HistoryItem> history;     // history array

    //constructors
    Store() {

        inventory = new InventoryItem[]{
                new InventoryItem(100.0, 10, "pants"),
                new InventoryItem(400.0, 40, "shoes"),
                new InventoryItem(99.0, 50, "shirts"),
        };

        history = new ArrayList<HistoryItem>();
    }

    //methods
    public static void printInventory() {
        for (int i = 0; i < inventory.length; i++) {
            System.out.println((i + 1) + "-" + inventory[i].toString());
        }
    }

    //this is a buying items and update history of purchasing
    public double purchase(int index, int howMany) {
        InventoryItem objectSelect = inventory[index - 1];
        if (objectSelect.isEnoughQuantity(howMany)) {
            double totalAmount = objectSelect.getPrice() * howMany;
            HistoryItem hObj = new HistoryItem(totalAmount, howMany, objectSelect.getDescription(), new Date());
            history.add(hObj);
            return totalAmount;
        }
        return -1;
    }


    //for manager's menu for restock and report
    public InventoryItem restock(int index, int qntToAdd) {
        InventoryItem selected = inventory[index - 1];
        selected.setQuantity(selected.getQuantity() + qntToAdd);
//        System.out.println(selected);
        return selected;
    }

    public void report() {
        System.out.println("Here is a report about purchasing: ");
        if (history.size() == 0) {
            System.out.println("    Unfortunately, it was no purchasing today.");
        }
        for (HistoryItem xI : history) {
            System.out.println(xI.toString());
        }
        System.out.println();
    }
}
