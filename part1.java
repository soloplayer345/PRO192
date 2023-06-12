/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;


/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class part1 {
    
    public static void main(String[] args) {
        int rows;
        int cols;
        int matrix[][];
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows=sc.nextInt();
        System.out.print("Enter number of cols: ");
        cols=sc.nextInt();
        matrix= new int[rows][cols];
        System.out.println("Enter the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("\nm["+i+"]["+j+"]=");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix inputed:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("%3d",matrix[i][j]);
            }
            System.out.println("\n");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum=sum+matrix[i][j];
            }
        }
        System.out.println("Sum: "+sum);
        System.out.println("Average:"+(float)sum/(rows*cols));
    }
}
