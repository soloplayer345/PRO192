
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

    public Audi(int releaseYear, String color, String id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.releaseYear = releaseYear;
        this.color = color;
    }

    public Audi() {
        super();
        releaseYear=0;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[]listColor ={"Black","White","Red","Gray"};
        List checkColor = Arrays.asList(listColor);
        if (checkColor.contains(color)) {
            this.color=color;
        } else {
            this.color="Black";
        }
    }

}
