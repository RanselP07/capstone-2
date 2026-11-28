package com.pluralsight;

public class Side extends Item implements MenuItem {

    public Side(int quantity, String size, String type) {
        super(quantity, size, type);
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getSummary() {
        return getQuantity() + " " + getSize() + " " + getType();
    }
}
