/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author ADMIN
 */
public class Colony extends Organization {

    private String place;

    public Colony(String place, int size) {
        super(size);
        this.place = place;
    }

    public Colony() {
    }

    @Override
    public void communicateByTool() {
        System.out.println("the colony communicate by sound");
    }

    public Colony(String place) {
        this.place = place;
    }

    public void grow() {
        System.out.println("an annual cycle of growth that begin in spring");
    }

    public void reproduce() {
        System.out.println("Colony can reproduce itself through a process");
    }

    @Override
    public String toString() {
        return String.format("the colony size is %d, the colony's place is %s%n", getSize(), place);
    }

}
