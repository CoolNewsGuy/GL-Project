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
public class Utilisateur {
    protected int idUtilisateur;
    protected String nom;
    protected String email;
    protected String telephone;
    protected String password;

    // Constructor
    public Utilisateur(int idUtilisateur, String nom, String email, String telephone, String password) {
        this.idUtilisateur = idUtilisateur;
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
    }

    // Common getters
    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getPassword() {
        return password;
    }
}
