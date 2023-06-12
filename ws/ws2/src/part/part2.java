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
public class part2 {

    public static void main(String[] args) {
        boolean cont = false;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                String s = "";
                String pattern = "SE\\d{3}";
                System.out.print("enter the string: ");
                s = sc.nextLine();
                if (!s.matches(pattern)) {
                    throw new Exception();
                }
                System.out.format("The string is %s", s);
                cont = false;
            } catch (Exception e) {
                System.out.println("the string is invalid");
                cont = true;
            }
        } while (cont);
    }
}
//\d - Matches any digit (0-9).
//{3} - Specifies that the previous element (digit) should occur exactly 3 times.
