package com.java;

import java.text.DecimalFormat;

public class ReceiptGenerator {

    private static DecimalFormat money = new DecimalFormat("#0.00");

    public static com.java.Receipt generateReceipt(com.java.Item[] basket) {
        if(basket == null) {
            return null;
        };
        com.java.Receipt receipt = new com.java.Receipt();
        for (com.java.Item item: basket) {
            receipt.itemPricesAfterTax = receipt.itemPricesAfterTax.concat("\n" + item.quantity + " " + item.name + ": $" + money.format(calcItemPriceAfterTax(item)));
        }
        System.out.println(receipt.itemPricesAfterTax);
        receipt.totalDue = calcTotalDue(basket);
        receipt.totalTax = calcTotalTax(basket);
        System.out.println("Sales Taxes: $" + money.format(receipt.totalTax) + " Total: $" + money.format(receipt.totalDue) + "\n");
        return receipt;
    }

    private static double calcTotalDue(com.java.Item[] basket) {
        double totalDue = 0.0;
        for (com.java.Item item: basket) {
            totalDue += calcItemPriceAfterTax(item);
        }
        return Math.round(totalDue * 100.00) / 100.00;
    }

    private static double calcTotalTax(com.java.Item[] basket) {
        double totalTax = 0.0;
        for (com.java.Item item: basket) {
            totalTax += ((Math.ceil((item.price * item.taxRate) * 20.00) / 20.00) * item.quantity);
        }
        return Math.round(totalTax * 100.00) / 100.00;
    }

    private static double calcItemPriceAfterTax(com.java.Item item) {
        double itemPriceAfterTax = ((Math.ceil((item.price * item.taxRate) * 20.00) / 20.00) + item.price) * item.quantity;
        return Math.round(itemPriceAfterTax * 100.00) / 100.00;
    }
}
