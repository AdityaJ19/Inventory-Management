package InventoryManagementProject;

package models;

public class User {
    private String username;
    private String password;
    private String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters and Setters

    public boolean validate() {
        // Validate user credentials
        // TODO: Add actual validation logic
        return true;
    }
}
