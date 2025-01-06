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
    private Client client;
    private ArrayList<Produit> cartItems;
    private String orderDate;
    private String status;
    private float totalPrice;

    // Constructor
    public Commande(int orderID, Client client, ArrayList<Produit> cartItems, String orderDate, String status) {
        this.orderID = orderID;
        this.client = client;
        this.cartItems = cartItems;
        this.orderDate = orderDate;
        this.status = status;

        for (Produit produit : cartItems) {
            this.totalPrice += produit.getPrice();
        }
    }

    public void viewCommandeDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("User ID: " + client.idUtilisateur);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + status);
        System.out.println("Products:");

        for (Produit produit : cartItems) {
            System.out.println("- " + produit.getName() + " ($" + produit.getPrice() + ")");
        }

        System.out.println("Total Price: $" + totalPrice);
    }

    public void approveCommande() {
        System.out.println("Commande approved with the following details:");
        viewCommandeDetails();
        System.out.println("The order has been approved.");
    }

    public void cancelCommande() {
        System.out.println("Commande cancelled with the following details:");
        viewCommandeDetails();
        System.out.println("The order has been cancelled.");
    }
}
