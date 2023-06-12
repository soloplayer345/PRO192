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
        float num1, num2, num3 = 0;
        String op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number 1: ");
        num1 = sc.nextFloat();
        System.out.print("Input the number 2: ");
        num2 = sc.nextFloat();
        System.out.print("Input the operator(+-*/): ");
        sc = new Scanner(System.in);
        op = sc.nextLine();
        switch (op) {
            case ("+") ->
                num3 = num1 + num2;
            case ("-") ->
                num3 = num1 - num2;
            case ("*") ->
                num3 = num1 * num2;
            case ("/") ->
                num3 = num1 / num2;
            default ->
                System.exit(0);
        }
        System.out.println(num1 + op + num2 + "=" + num3);
    }
}
