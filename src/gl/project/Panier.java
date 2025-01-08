/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl.project;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author gh
 */
public class Panier {
    public final Map<Produit, Integer> cartItems = new HashMap<>();
    private float totalPrice;

    // Methods
    public Map<Produit, Integer> getCartItems() {
        return cartItems;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void ajouterAuPanier(Produit produit, int quantite) {
        if (cartItems.containsKey(produit)) {
            int produitQuantiteInPanier = cartItems.get(produit);

            if (produitQuantiteInPanier >= produit.getStock()) {
                System.out.println("Can't add product: " + produit.getName() + " (out of stock).");

                return;
            }

            int newQuantiteInPanier = produitQuantiteInPanier + quantite;

            if (newQuantiteInPanier > produit.getStock()) {
                newQuantiteInPanier = produit.getStock();
            }

            cartItems.put(produit, newQuantiteInPanier);
        } else {
            int newQuantiteInPanier = quantite;

            if (newQuantiteInPanier > produit.getStock()) {
                newQuantiteInPanier = produit.getStock();
            }

            cartItems.put(produit, quantite);
        }

        calculateTotal();
        System.out.println("Added to cart: " + produit.getName() + " (Quantity: " + quantite + ")");
    }

    public void supprimerDuPanier(Produit produit, int quantite) {
        if (cartItems.containsKey(produit)) {
            int quantiteInCart = cartItems.get(produit);

            if (quantiteInCart <= quantite) {
                cartItems.remove(produit);
            } else {
                cartItems.put(produit, quantiteInCart - quantite);
            }

            calculateTotal();
            System.out.println("Removed from cart: " + produit.getName());
        } else {
            System.out.println("Product not found in cart.");
        }
    }

    public void calculateTotal() {
        totalPrice = 0f;

        for (Entry<Produit, Integer> produitEntry : cartItems.entrySet()) {
            totalPrice += produitEntry.getKey().getPrice() * produitEntry.getValue();
        }
    }

    public void afficherPanier() {
        System.out.println("Products in the cart:");

        for (Entry<Produit, Integer> produitEntry : this.cartItems.entrySet()) {
            System.out.println(produitEntry.getKey().getName() + " (Quantity: " + produitEntry.getValue() + ")");
        }
    }

}
