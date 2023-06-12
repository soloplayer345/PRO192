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
public class Vase extends Item{
    private  int height;
    private String material;

    public Vase() {
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void inputVase(){
        input();
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a height: ");
        height=sc.nextInt();
        System.out.print("Input a material: ");
        sc=new Scanner(System.in);
        material =sc.nextLine();
    }
    public void outputVase(){
        output();
        System.out.format("Height: %d%nMarerial: %s%n",height,material);
    }
}
