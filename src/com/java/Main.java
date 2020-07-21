package com.java;

public class Main {

    public static void main(String[] args) {
        // Input 1:
        com.java.Item book = new com.java.Item(1, "book", 12.49, true, false);
        com.java.Item musicCD = new com.java.Item(1, "music CD", 14.99, false, false);
        com.java.Item chocolateBar = new com.java.Item(1, "chocolate bar", 0.85, true, false);

        com.java.Item[] basket1 = new com.java.Item[]{book, musicCD, chocolateBar};

        ReceiptGenerator.generateReceipt(basket1);

        // Input 2:
        com.java.Item importedBoxOfChocolates1 = new com.java.Item(1, "imported box of chocolates", 10.00, true, true);
        com.java.Item importedBottleOfPerfume1 = new com.java.Item(1, "imported bottle of perfume", 47.50, false, true);

        com.java.Item[] basket2 = new com.java.Item[]{importedBoxOfChocolates1, importedBottleOfPerfume1};

        ReceiptGenerator.generateReceipt(basket2);

        // Input 3:
        com.java.Item importedBottleOfPerfume2 = new com.java.Item(1, "imported bottle of perfume", 27.99, false, true);
        com.java.Item bottleOfPerfume = new com.java.Item(1, "bottle of perfume", 18.99, false, false);
        com.java.Item packetOfHeadachePills = new com.java.Item(1, "packet of headache pills", 9.75, true, false);
        com.java.Item importedBoxOfChocolates2 = new com.java.Item(1, "imported box of chocolates", 11.25, true, true);

        com.java.Item[] basket3 = new com.java.Item[]{importedBottleOfPerfume2, bottleOfPerfume, packetOfHeadachePills, importedBoxOfChocolates2};

        ReceiptGenerator.generateReceipt(basket3);
    }
}