package com.zomato.model;

import java.util.List;

public class Order {
    private List<FoodItem> items;

    public Order(List<FoodItem> items) {
        this.items = items;
    }

    public double calculateTotal() {
        double total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
