package com.bridgelabz.wareManagement;


public class WarehouseSystem {
    public static void main(String[] args) {
        // Create storage for different item types
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Add items to storage with cost attribute
        electronicsStorage.addItem(new Electronics("Iron", 1500, 1));
        electronicsStorage.addItem(new Electronics("TV", 5475, 5));

        groceriesStorage.addItem(new Groceries("Banana", 3, "2025-02-07"));
        groceriesStorage.addItem(new Groceries("Water", 4, "2025-01-14"));

        furnitureStorage.addItem(new Furniture("Table", 45, "Wood"));
        furnitureStorage.addItem(new Furniture("Chair", 524, "Metal"));

        // Display all items using wildcard method
        System.out.println("--------Electronics Storage ---------");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("\n--------- Groceries Storage ------------");
        Storage.displayItems(groceriesStorage.getItems());

        System.out.println("\n-------- Furniture Storage --------------");
        Storage.displayItems(furnitureStorage.getItems());
    }
}
