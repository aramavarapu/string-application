package com.pluralsight;
public class Receipt {
    public static void main(String[] args) {
        //1.Created variables for an item name (String) and item price (double)
        String itemName = "Elden Ring";
        double itemPrice = 59.99;
        //2.Created a quantity variable (int)
        int quantity = 1;
        //3. Build and print
        double total = itemPrice * quantity;
        System.out.println("You bought " + quantity + " " + itemName + " for " + total);
        System.out.println();

    }
}