/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author ADMIN
 */
public abstract class Organization {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Organization() {
    }

    public Organization(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("the organization's size is %d", getSize());
    }
    public abstract void communicateByTool();
}
