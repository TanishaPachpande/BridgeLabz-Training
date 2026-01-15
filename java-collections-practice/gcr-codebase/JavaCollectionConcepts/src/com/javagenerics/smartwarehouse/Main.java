package com.javagenerics.smartwarehouse;

public class Main {
    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 10, 2));
        electronicsStorage.addItem(new Electronics("Mobile", 20, 1));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice", 50, "2026-01-01"));
        groceriesStorage.addItem(new Groceries("Milk", 30, "2025-02-10"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 15, "Wood"));
        furnitureStorage.addItem(new Furniture("Table", 5, "Steel"));

        System.out.println("---- Electronics ----");
        WarehouseUtil.displayAllItems(electronicsStorage.getItems());

        System.out.println("---- Groceries ----");
        WarehouseUtil.displayAllItems(groceriesStorage.getItems());

        System.out.println("---- Furniture ----");
        WarehouseUtil.displayAllItems(furnitureStorage.getItems());
    }
}

