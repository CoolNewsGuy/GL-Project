/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl.project;

import java.util.List;

/**
 *
 * @author gh
 */
public class Categorie {
    private int idCategorie;
    private String name;

    // Constructor
    Categorie(int idCategorie, String name, List<String> subcategories) {
        this.idCategorie = idCategorie;
        this.name = name;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public String getName() {
        return name;
    }
}
