package InventoryManagementProject;

import javax.swing.*;

public class InventoryManagementApp {
    public static void main(String[] args) {
        // Initialize the main GUI components
        SwingUtilities.invokeLater(() -> {
            LoginForm loginForm = new LoginForm();
            loginForm.setVisible(true);
        });
    }
}
