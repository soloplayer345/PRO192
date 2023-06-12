/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Car {

    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;

    public Car() {
    }

    public Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    public void pressStarButton() {
        System.out.println("you have press the start button");
    }

    public void pressAcceleratorButton() {
        System.out.println("you have press the Accelerator button");
    }

    public void output() {
        System.out.format("Colour: %s\nEnginePower: %d\nCovertilbe: %b\nParkingBrake: %b\n", colour, enginePower, convertible, parkingBrake);
    }
}
