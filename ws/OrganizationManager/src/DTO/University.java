/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author ADMIN
 */
public class University extends Organization {

    private String name;

    public University() {
    }

    public University(String name, int size) {
        super(size);
        this.name = name;
    }

    @Override
    public void communicateByTool() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void endroll() {
        System.out.println("""
                       The registration for enrollment is only valid
                       when the University has received all enrollment documents and enrollment fees""");
    }

    public void educate() {
        System.out.println("provide education at university standard");
    }

    @Override
    public String toString() {
        return String.format("encourage the advancement and development of knowledge%n");
    }

}
