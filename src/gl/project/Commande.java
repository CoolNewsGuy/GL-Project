/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl.project;

import java.util.List;

/**
 *
 * @author gh
 */
public class Commande {
      private int orderID;
    private int userID;
    private List<Produit> cartItems;
    private String orderDate;
    private String status;

    // Constructor
    public Commande(int orderID, int userID, List<Produit> cartItems, String orderDate, String status) {
        this.orderID = orderID;
        this.userID = userID;
        this.cartItems = cartItems;
        this.orderDate = orderDate;
        this.status = status;
    }

    public void approveCommande() {
        System.out.println("Commande approved with the following details:");
        System.out.println("Order ID: " + orderID);
        System.out.println("User ID: " + userID);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + status);
        System.out.println("Products:");
        float totalPrice = 0;
        for (Produit produit : cartItems) {
            System.out.println("- " + produit.getName() + " ($" + produit.getPrice() + ")");
            totalPrice += produit.getPrice();
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
