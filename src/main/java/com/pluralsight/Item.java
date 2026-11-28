package com.pluralsight;

public abstract class Item {
    private int quantity;
    private String size;
    private String type;

    public Item(int quantity, String size, String type) {
        this.quantity = quantity;
        this.size = size;
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}
