/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class tester {
     public static void main(String[] args){
       Guitar ob1 = new Guitar();
       Guitar ob2 = new Guitar("G123",2000,"Sony","Model123","HardWood","SoftWood");
       
       System.out.println("State of ob1: ");
       ob1.createSound();
       
       System.out.println("State of ob2: ");
       ob2.createSound();
       
       System.out.println("Set price = 3000 of obj1");
       ob1.setPrice(3000);
       System.out.println("Get price of obj1: "+ ob1.getPrice());
               
   } 
}
