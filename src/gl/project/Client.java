/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl.project;

/**
 *
 * @author gh
 */
public class Client extends Utilisateur {

    private final Panier panier;

    // Constructor
    public Client(int idUtilisateur, String nom, String email, String telephone, String password) {
        super(idUtilisateur, nom, email, telephone, password);
        this.panier = new Panier(); // Each client has one panier
    }

    // Methods
    public void register(String nom, String email, String telephone, String password) {
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        System.out.println("Client registered with details: Name=" + nom + ", Email=" + email + ", Phone=" + telephone);
    }

    public void login(String identifier, String password) {
        if ((identifier.equals(this.email) || identifier.equals(this.telephone)) && password.equals(this.password)) {
            System.out.println("Client logged in successfully: " + nom);
        } else {
            System.out.println("Login failed: Incorrect email/phone or password.");
        }
    }

    public Panier getPanier() {
        return panier;
    }

    public void ajouterAuPanier(Produit produit, int quantite) {
        if (panier.getCartItems().containsKey(produit)) {
            int produitQuantiteInPanier = panier.getCartItems().get(produit);

            if (produitQuantiteInPanier >= produit.getQuantite()) {
                System.out.println("Can't add product: " + produit.getName() + " (out of stock).");

                return;
            }

            panier.cartItems.put(produit, produitQuantiteInPanier + 1);
        } else {
            panier.cartItems.put(produit, 1);
        }

        panier.setTotalPrice(panier.getTotalPrice() + produit.getPrice() * quantite);
        System.out.println("Added to cart: " + produit.getName() + " (Quantity: " + quantite + ")");
    }

    void supprimerDuPanier(Produit produit, int quantite) {
        int index = panier.getCartItems().indexOf(produit);
        if (index >= 0) {
            panier.setTotalPrice(panier.getTotalPrice() - produit.getPrice() * panier.getQuantities().get(index));
            panier.getCartItems().remove(index);
            panier.getQuantities().remove(index);
            System.out.println("Removed from cart: " + produit.getName());
        } else {
            System.out.println("Product not found in cart.");
        }
    }

    public void sendMessage(String message) {
        System.out.println("Message from " + getNom() + ": " + message);

    }
}
