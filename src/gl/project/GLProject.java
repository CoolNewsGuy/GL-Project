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

        // Create a Produit
        Produit laptop = new Produit(101, "Laptop", 1500.0f, "High-performance laptop", 10, "Electronics", "Computers", "image.jpg");
        laptop.getProductDetails();

        Produit produit2 = new Produit(102, "Smartphone", 700.0f, "Latest model smartphone", 20, "Electronics", "Mobile", "smartphone.jpg");
        produit2.getProductDetails();

        // initial likes
        System.out.println("Likes: " + laptop.getLikes());

        // increasing likes
        laptop.increaseLikes();
        laptop.increaseLikes();
        System.out.println("Likes : " + laptop.getLikes());

        // decreasing likes
        laptop.decreaseLikes();
        System.out.println("Likes : " + laptop.getLikes());

        // Crée un Panier
        client.ajouterAuPanier(laptop, 2); // Add 2 Laptops
        client.ajouterAuPanier(produit2, 1); // Add 1 Smartphone
        client.getPanier().afficherPanier();

        //Total Price
        System.out.println("Total Price in Cart: " + client.getPanier().getTotalPrice());

        // Remove product from chart
        client.supprimerDuPanier(laptop, 1);
        client.getPanier().afficherPanier();

        // Place an order
        Commande commande = new Commande(1, client.getIdUtilisateur(), client.getPanier().getCartItems(), "2025-01-03", "Pending");
        commande.approveCommande();

        // Cancel the order
        commande.cancelCommande();

        // Create an Administrateur (Admin)
        Administrateur admin = new Administrateur(2, "Bob", "bob@example.com", "0987654321", "admin123");

        client.sendMessage("hey how is my oorder?");

        admin.replyToMessage(client, "thank you for contacting we will see what we can do");

    }
}
