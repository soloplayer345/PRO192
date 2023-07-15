
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class menu {

    public static void main(String[] args) {
        int choice;
        String code, name;
        int mark;
        Scanner sc = new Scanner(System.in);
        StudentList stdList = new StudentList();
        do {
            System.out.print("""
                               Select a function !
                               1. Add new a student
                               2. View student list
                               3. Find a student by code
                               4. Update a student
                               5. Remove student 
                               6. Exit
                               Select :""");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("enter student code: ");
                    code = sc.next();
                    System.out.print("Full name:");
                    name = sc.next();
                    System.out.print("Mark: ");
                    mark = sc.nextByte();
                    Student newStudent = new Student(code, name, mark);
                    stdList.addStudent(newStudent);
                    break;
                case 2:
                    stdList.displayALLStudent();
                    break;
                case 3:
                    System.out.print("student code you want to find: ");
                    String result = sc.next();
                    stdList.searchStudent(result);
                    break;
                case 4:
                    System.out.print("student code you want to update: ");
                    String sar = sc.next();
                    stdList.searchStudent(sar);
                    break;
                    case 5:
                    System.out.print("student code you want to remove: ");
                    String del =sc.next();
                    stdList.removeStudent(del);
                    break;
                default:
                   System.exit(0);
            }
        } while (1 <= choice && choice <= 5);
    }
}
