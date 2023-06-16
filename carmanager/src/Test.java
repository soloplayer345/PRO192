/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Test {
     public static void main(String[] args) throws Exception{
        Car c = new Car();
        c.pressStartButton();
        c.pressAcceleratorButton();
        
        Car c2= new Car();
        c2.pressAcceleratorButton();
        
        Car c3 = new Car("red", 100, true, true);
        c3.pressAcceleratorButton();
        c3.setColour("black");
        System.out.println("Colour of c3: " + c3.getColour());
        c3.output();
    }
}
