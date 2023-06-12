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
public class Statue extends Item{
    private int weight;
    private String colour;

    public Statue() {
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void inputStatue(){
        input();
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a weight: ");
        weight=sc.nextInt();
        System.out.print("Input a colour: ");
        sc=new Scanner(System.in);
        colour =sc.nextLine();
    }
    public void outputStatue(){
        output();
        System.out.format("Weight: %d%nColour: %s%n",weight,colour);
    }
}
