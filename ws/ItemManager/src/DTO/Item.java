/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Item {

    private int value;
    private String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value > 0) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Value must bigger than 0");
        }
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        if (creator != null && !creator.isEmpty()) {
            this.creator = creator;
        } else {
            // Handle the invalid input, such as throwing an exception or displaying an error message
            throw new IllegalArgumentException("Creator cannot be null or empty.");
        }
    }

    public void output() {
        System.out.format(" Value: %d%n Creator: %s%n", getValue(), getCreator());
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Value: ");
        int v = sc.nextInt();
        setValue(v);
        System.out.println("Creator: ");
        sc = new Scanner(System.in);
        String c = sc.nextLine();
        setCreator(c);
    }
}
