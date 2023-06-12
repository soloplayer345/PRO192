/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice, firstNumber, secondNumber;
        double result;
        Scanner sc = new Scanner(System.in);
        //in menu ra man hinh
        System.out.println("welcome to Java program");
        System.out.print("Enter first munber:");
        //nhap vao 2 so
        firstNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Enter second number:");
        secondNumber = Integer.parseInt(sc.nextLine());
        //vòng lập thực hiện liên tục các phép tính
        do {
            System.out.println("select operation:");
            System.out.println("1.Add");
            System.out.println("2.Sub");
            System.out.println("3.Mul");
            System.out.println("4.Div");
            System.out.println("5.Exit");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> {
                    result = firstNumber + secondNumber;
                    System.out.format("%d+%d=%.2f\n", firstNumber, secondNumber, result);
                }
                case 2 -> {
                    result = firstNumber - secondNumber;
                    System.out.format("%d-%d=%.2f\n", firstNumber, secondNumber, result);
                }
                case 3 -> {
                    result = firstNumber * secondNumber;
                    System.out.format("%d*%d=%.2f\n", firstNumber, secondNumber, result);
                }
                case 4 -> {
                    result = firstNumber / secondNumber;
                    System.out.format("%d/%d=%.2f\n", firstNumber, secondNumber, result);
                }
                default -> {
                    System.out.println("Thank you. Good bye");
                    System.exit(0);
                }
            }
        } while (choice < 5);//end main
    }

}
