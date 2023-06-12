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
public class Painting extends Item{
    private  int height;
    private int weight;
    private boolean isWatercolour;
    private boolean isFrame;

    public Painting(int height, int weight, boolean isWatercolour, boolean isFrame, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.weight = weight;
        this.isWatercolour = isWatercolour;
        this.isFrame = isFrame;
    }

    public Painting() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFrame() {
        return isFrame;
    }

    public void setIsFrame(boolean isFrame) {
        this.isFrame = isFrame;
    }
    public void inputPainting(){ //better use with try-catch if have time
        input();
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a height: ");
        height=sc.nextInt();
        System.out.print("Input a weight: ");
        weight=sc.nextInt();
        System.out.print("Is it  watercolour?");
        sc=new Scanner(System.in);
        isWatercolour= sc.nextBoolean();
        System.out.print("Is it frame?");
        isFrame= sc.nextBoolean();
    }
    public void outputPainting(){
        output();
        System.out.format("Height: %d%nWeight: %d%nWatercolour: %b%n Frame %b%n",height,weight,isWatercolour,isFrame);            
        }
    }
