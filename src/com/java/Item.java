package com.java;

public class Item {
    double price;
    double taxRate;
    boolean isTaxExempt;
    boolean isImported;
    String name;
    int quantity;

    public Item(int quantity, String name, double price, boolean isTaxExempt, boolean isImported) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.isTaxExempt = isTaxExempt;
        this.isImported = isImported;
        if (this.isTaxExempt && this.isImported) {
            this.taxRate = 0.05;
        } else if (this.isTaxExempt){
            this.taxRate = 0.0;
        } else if(this.isImported) {
            this.taxRate = 0.15;
        } else {
            this.taxRate = 0.10;
        }
    }
}