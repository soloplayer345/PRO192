/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author ADMIN
 */
public class BeeColony extends Colony implements Role {

    private String type;

    public BeeColony(String type, String place, int size) {
        super(place, size);
        this.type = type;
    }

    public BeeColony() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("the colony's type is %s, %s", type, super.toString());
    }

    @Override
    public void createWorker() {
        System.out.println("worker bees performall the work of the bees");
    }

}
