

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class Vehicle {

    private String id;
    private String name;
    private double price;
    private int quantity;

    public Vehicle() {
        id="";
        name="";
        price=0;
        quantity=0;
    }

    public Vehicle(String id, String name, double price, int quantity) {
        setId(id);
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity>=1 && quantity<=1000) {
            this.quantity = quantity;
        } else {
            this.quantity=1;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String pattern = "^V[0-9]{6}$";
        if (!id.matches(pattern) || id.isBlank()) {
            this.id = "V000000";
        } else {
            this.id = id.toUpperCase();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 5 && name.length() <= 50) {
            this.name = name; //them tilecase
        } else {
            this.name = "new vehicle";
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>=1 && price<=100000000) {
            this.price = price;
        } else {
            this.price=1;
        }
    }

    public double getSubTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%.2f,%d,%.2f", id, name, price, quantity, getSubTotal());
    }

}
