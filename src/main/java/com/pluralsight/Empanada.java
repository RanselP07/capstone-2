package com.pluralsight;

import java.util.List;

public class Empanada extends Item implements MenuItem {
    private List<String> toppings;

    public Empanada(int quantity, String size, String type, List<String> toppings) {
        super(quantity, size, type);
        this.toppings = toppings;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getSummary() {
        return "";
    }
}
