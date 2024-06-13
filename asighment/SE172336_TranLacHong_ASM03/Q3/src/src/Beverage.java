/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public abstract class Beverage {

    private String id;
    private String name;
    private double price;
    private int quantity;

    public Beverage() {
        id = "";
        name = "";
        price = 0;
        quantity = 0;
    }

    public Beverage(String id, String name, double price, int quantity) {
        setId(id);
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String pattern = "^[A-Z]{2}\\d{3}$";//format: XXxx(X is letter, x is digit)
        if (id.matches(pattern)) {
            this.id = id;
        } else {
            this.id = "TN000";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty() && name.length() >= 5 && name.length() <= 5) {
            this.name = Mylibs.toTitleCase(name);
        } else {
            this.name = "New Beverage";
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 1 && price <= 5000) {
            this.price = price;
        } else {
            this.price = 1;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 1 && quantity <= 100) {
            this.quantity = quantity;
        } else {
            this.quantity = 1;
        }
    }

    abstract double subTotal();

    @Override
    public String toString() {
        double subTotal = price * quantity;
        return String.format("%s, %s, %.3f, %d,%.3f", getId(), getName(), getPrice(), getQuantity(), subTotal);
    }

}
