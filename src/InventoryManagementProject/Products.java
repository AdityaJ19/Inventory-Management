package InventoryManagementProject;

package models;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;
    private String category;

    public Product(int id, String name, int quantity, double price, String category) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    // Getters and Setters

    public boolean validate() {
        // Validate product details
        // TODO: Add actual validation logic
        return true;
    }
}
