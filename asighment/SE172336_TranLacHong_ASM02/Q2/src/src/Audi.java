
import java.util.Arrays;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class Audi extends Vehicle {

    private int releaseYear;
    private String color;

    public Audi(String id, String name, double price, int quantity, String color, int releaseYear) {
        super(id, name, price, quantity);
        this.releaseYear = releaseYear;
        this.color = color;
    }

    public Audi() {
        super();
        releaseYear = 0;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        if (releaseYear >= 2022 && releaseYear <= 2025) {
            this.releaseYear = releaseYear;
        } else {
            this.releaseYear = 2022;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] listColor = {"Black", "White", "Red", "Gray"};
        List checkColor = Arrays.asList(listColor);
        if (checkColor.contains(Mylibs.toTitleCase(color))) {
            this.color = color;
        } else {
            this.color = "Black";
        }
    }

    @Override
    public double getSubTotal() {
        double x =1;
        if (releaseYear== 2025 || color.equals("Red")) {
            x=1.2;
        } else {
            x=1;
        }
        return super.getSubTotal()*x;
    }

    @Override
    public String toString() {
        return "Audi{" + "releaseYear=" + releaseYear + ", color=" + color + '}';
    }

}
