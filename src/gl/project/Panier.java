/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl.project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gh
 */
public class Panier {
     private final List<Produit> cartItems = new ArrayList<>();
    private final List<Integer> quantities = new ArrayList<>();
    private float totalPrice;

    // Methods
    public List<Produit> getCartItems() {
        return cartItems;
    }

    public List<Integer> getQuantities() {
        return quantities;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void calculateTotal() {
        System.out.println("Total cart value: " + totalPrice);
    }

    public void afficherPanier() {
        System.out.println("Products in the cart:");
        for (int i = 0; i < cartItems.size(); i++) {
            Produit product = cartItems.get(i);
            int quantity = quantities.get(i);
            System.out.println(product.getName() + " (Quantity: " + quantity + ")");
        }
    }

}
