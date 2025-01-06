/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl.project;

import java.util.ArrayList;

/**
 *
 * @author gh
 */
public class Commande {
    private int orderID;
    private int userID;
    private ArrayList<Produit> cartItems;
    private String orderDate;
    private String status;
    private float totalPrice;

    // Constructor
    public Commande(int orderID, int userID, ArrayList<Produit> cartItems, String orderDate, String status) {
        this.orderID = orderID;
        this.userID = userID;
        this.cartItems = cartItems;
        this.orderDate = orderDate;
        this.status = status;

        for (Produit produit : cartItems) {
            this.totalPrice += produit.getPrice();
        }
    }

    public void approveCommande() {
        System.out.println("Commande approved with the following details:");
        System.out.println("Order ID: " + orderID);
        System.out.println("User ID: " + userID);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + status);
        System.out.println("Products:");

        for (Produit produit : cartItems) {
            System.out.println("- " + produit.getName() + " ($" + produit.getPrice() + ")");
        }

        System.out.println("Total Price: $" + totalPrice);
        System.out.println("The order has been approved.");
    }

    public void cancelCommande() {
        System.out.println("Commande cancelled with the following details:");
        System.out.println("Order ID: " + orderID);
        System.out.println("User ID: " + userID);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + status);
        System.out.println("Products:");

        for (Produit produit : cartItems) {
            System.out.println("- " + produit.getName() + " ($" + produit.getPrice() + ")");
        }

        System.out.println("The order has been cancelled.");
    }
}
