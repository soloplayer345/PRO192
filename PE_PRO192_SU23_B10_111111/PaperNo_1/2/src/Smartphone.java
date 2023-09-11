/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Smartphone extends Product {

    private int price;
    private int internal_memory;
    private float weight;

    public Smartphone(String code,String name,int internal_memory,float weight,int price) {
        super(code, name);
        this.price = price;
        this.internal_memory = internal_memory;
        this.weight = weight;
    }

    

    public void showInfo() {
        System.out.println(getCode() + "-" + getName() + "-" + internal_memory + "GB-" + weight + "g" + price + "$");
    }

    public double buyNow(int quantity) {
        if (getName().equals("IPHONE 14 PROMAX") && quantity <= 5) {
            price = price * (80 / 100);
        }
        return quantity * price;
    }
}
