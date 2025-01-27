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
    public final Panier panier = new Panier();

    // Constructor
    public Client(int idUtilisateur, String nom, String email, String telephone, String password) {
        super(idUtilisateur, nom, email, telephone, password);
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

    public void sendMessage(String message) {
        System.out.println("Message from " + getNom() + ": " + message);

    }
}
