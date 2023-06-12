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
public class Part2_2 {
    public String inputString() throws Exception{
        String pattern="SE\\d{3}";
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("input the string: ");
        s=sc.nextLine();
        if (!s.matches(pattern)) {
            throw new Exception();
        }
        return s;
    }
    public static void main(String[] args) {
        Part2_2 obj=new Part2_2();
        boolean cont;
        do {            
            try {
                String s=obj.inputString();
                System.out.format("the string is %s",s);
                cont=false;
            } catch (Exception e) {
                System.out.println("the string is invalid");
                cont=true;
            }
        } while (cont);
    }
}
