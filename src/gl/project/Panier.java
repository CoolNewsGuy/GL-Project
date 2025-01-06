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

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void calculateTotal() {
        System.out.println("Total cart value: " + totalPrice);
    }

    public void afficherPanier() {
        System.out.println("Products in the cart:");

        for (Entry<Produit, Integer> produitEntry : this.cartItems.entrySet()) {
            System.out.println(produitEntry.getKey().getName() + " (Quantity: " + produitEntry.getValue() + ")");
        }
    }

}
