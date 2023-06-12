/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class part1 {
    public static void main(String[] args) {
        boolean cont=false;
        do {            
            try {
                int num;
                Scanner sc= new Scanner(System.in);
                System.out.println("enter the number:");
                num=sc.nextInt();
                if (num<1){ 
                    throw new Exception();
                }
                    System.out.format("The number is:%d",num);
                    cont=false;
            } catch (Exception e) {
                System.out.println("the number is invalid");
                cont=true;
            }
        } while (cont);
    }
}
