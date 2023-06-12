/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;//better with button hmm if have time remind me

import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class antiqueshop {
    public static void main(String[] args) {
        Item item=null;
        int choice=0;
        Scanner sc=new Scanner(System.in);
        do {            
            System.out.println("1. Create a Vase:");
            System.out.println("2. Create a Statue:");
            System.out.println("3. Create a Painting:");
            System.out.println("4. Display the Item:");
            System.out.println("Input a choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    item=new Vase();
                    ((Vase)item).inputVase();
                }
                case 2 -> {
                    item =new Statue();
                    ((Statue) item).inputStatue();
                }
                case 3 -> {
                    item =new Painting();
                    ((Painting) item).inputPainting();
                }
                    case 4 -> {
                        if (item!=null) {
                            if(item instanceof Vase)
                                ((Vase) item).outputVase();
                            else if(item instanceof Statue)
                                ((Statue) item).outputStatue ();
                            else if(item instanceof Painting) 
                                ((Painting) item).outputPainting ();
                        }
                        else System.out.println("you need to create an object");
                }
                    default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice<5);
    }
}
