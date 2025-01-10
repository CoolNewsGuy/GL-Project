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
public class Categorie {
    private int idCategorie;
    private String name;
    private ArrayList<Produit> produits;

    // Constructor
    Categorie(int idCategorie, String name, ArrayList<Produit> produits) {
        this.idCategorie = idCategorie;
        this.name = name;
        this.produits = produits;
    }

    public void viewProduitsDetails() {
        for (Produit produit : produits) {
            produit.getProductDetails();
        }
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public String getName() {
        return name;
    }
}
