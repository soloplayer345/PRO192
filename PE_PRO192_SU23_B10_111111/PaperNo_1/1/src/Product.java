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
        System.out.println(this.id);
        System.out.println(this.discount);
    }

    public double subTotal() {
        System.out.println("quatity"+this.quantity);
        System.out.println("price"+this.price);
        System.out.println("discount"+this.discount);
        double result;
        double d= this.discount;
        result= (d/100.0);
        System.out.println("result"+result);
        return result;
    }
}
