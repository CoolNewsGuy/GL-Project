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
public class Administrateur extends Utilisateur {
    private ArrayList<Commande> commandes;

    // constructor
    public Administrateur(int idUtilisateur, String nom, String email, String telephone, String password) {
        super(idUtilisateur, nom, email, telephone, password);
    }

    // Methods
    public void replyToMessage(Client client, String message) {
        System.out.println("Message to " + client.getNom() + ": " + message);
    }
}
