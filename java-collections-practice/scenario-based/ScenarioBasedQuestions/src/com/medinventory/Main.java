package com.medinventory;

public class Main {
    public static void main(String[] args) {

        MedInventory<String> inventory = new MedInventory<>();

        inventory.processFile("inventory.csv");

        inventory.printExpiredItems();
        inventory.printCategorySummary();
    }
}

