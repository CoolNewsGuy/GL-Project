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
public class Produit {
    @SuppressWarnings("unused")
    private int idProduit;
    private String name;
    private float price;
    private int stock;
    @SuppressWarnings("unused")
    private Categorie category;
    private int likes = 0;

    public Produit(int idProduit, String name, float price, int stock, Categorie category) {
        this.idProduit = idProduit;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
        category.addProduit(this);
    }

    public void getProductDetails() {
        System.out.println("Product: " + name + ", Price: " + price + ", Quantite: " + stock + ", Likes: " + likes);
    }

    public void updateStock(int quantity) {
        this.stock += quantity;
        System.out.println("Stock updated. New stock: " + stock);
    }

    public void increaseLikes() {
        likes++;
        System.out.println(name + " received a like. Total likes: " + likes);
    }

    public void decreaseLikes() {
        if (likes > 0) {
            likes--;
            System.out.println(name + " lost a like. Total likes: " + likes);
        } else {
            System.out.println(name + " has no likes to remove.");
        }
    }

    public int getLikes() {
        return likes;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
