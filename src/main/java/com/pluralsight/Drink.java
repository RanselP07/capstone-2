package com.pluralsight;

import java.util.Scanner;

public class Drink extends Item implements MenuItem{

    public Drink(int quantity, String size, String type) {
        super(quantity, size, type);
    }


    @Override
    public double getPrice() {
        double price = 0;

        switch (getSize()){
            case "small" -> {price += (2 * getQuantity());}
            case "medium" -> {price += (2.5 * getQuantity());}
            case "large" -> {price += (3 * getQuantity());}
            default -> {System.out.println("We do not serve that size.");}
        }

        return price;
    }

    @Override
    public String getSummary() {
        return getQuantity() + " " + getSize() + " " + getType() + " - $" + String.format("%.2f", getPrice());
    }
}