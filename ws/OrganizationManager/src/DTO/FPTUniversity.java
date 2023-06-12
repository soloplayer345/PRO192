/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author ADMIN
 */
public class FPTUniversity extends University implements Role{
    private String addtress;

    public FPTUniversity() {
    }

    public FPTUniversity(String addtress, String name, int size) {
        super(name, size);
        this.addtress = addtress;
    }

    public String getAddtress() {
        return addtress;
    }

    public void setAddtress(String addtress) {
        this.addtress = addtress;
    }

    @Override
    public String toString() {
        return String.format("FPTU has four campus Hanoi, HCM, DaNang, CanTho, QuyNhon");
    }

    @Override
    public void createWorker() {
        System.out.println("providing hunam resources");
    }
    
    
}
