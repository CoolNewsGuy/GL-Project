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
public class GLProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Client
        Client client = new Client(1, "Alice", "alice@example.com", "1234567890", "password123");
        client.register("Alice", "alice@example.com", "1234567890", "password123");
        client.login("alice@example.com", "password123");
        System.out.println();

        // Create a Produit
        Produit laptop = new Produit(101, "Laptop", 1500.0f, "High-performance laptop", 10, "Electronics", "Computers",
                "image.jpg");
        Produit smartphone = new Produit(102, "Smartphone", 700.0f, "Latest model smartphone", 20, "Electronics",
                "Mobile", "smartphone.jpg");

        laptop.getProductDetails();
        smartphone.getProductDetails();
        System.out.println();

        // initial likes
        System.out.println("Laptop's likes: " + laptop.getLikes());

        // increasing likes
        laptop.increaseLikes();
        laptop.increaseLikes();
        System.out.println("Likes : " + laptop.getLikes());

        // decreasing likes
        laptop.decreaseLikes();
        System.out.println("Likes : " + laptop.getLikes());
        System.out.println();

        // Crée un Panier
        client.ajouterAuPanier(laptop, 2); // Add 2 Laptops
        client.ajouterAuPanier(smartphone, 1); // Add 1 Smartphone
        System.out.println();
        client.getPanier().afficherPanier();

        // Total Price
        System.out.println("Total Price in Cart: " + client.getPanier().getTotalPrice());
        System.out.println();

        // Remove product from chart
        client.supprimerDuPanier(laptop, 1);
        client.getPanier().afficherPanier();
        System.out.println();

        // Place an order
        Commande commande = new Commande(1, client.getIdUtilisateur(), client.getPanier().getCartItems(), "2025-01-03",
                "Pending");
        commande.approveCommande();
        System.out.println();

        // Cancel the order
        commande.cancelCommande();
        System.out.println();

        // Create an Administrateur (Admin)
        Administrateur admin = new Administrateur(2, "Bob", "bob@example.com", "0987654321", "admin123");

        client.sendMessage("hey how is my order?");
        admin.replyToMessage(client, "thank you for contacting we will see what we can do");
    }
}
