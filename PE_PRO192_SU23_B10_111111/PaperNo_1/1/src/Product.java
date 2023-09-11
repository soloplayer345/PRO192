/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Product {

    private int id;
    private String name;
    private double price;
    private int quantity;
    private int discount = 0;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity, int discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double subTotal() {
        return (quantity * price) * ((100 - discount) / 100);
    }
}
