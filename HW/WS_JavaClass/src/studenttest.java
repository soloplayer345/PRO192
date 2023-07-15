
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class studenttest {

    public static void main(String[] args) {
        int choice;
        String ID, FullName, Address, Phone;
        Date DoB = null;
        Scanner sc = new Scanner(System.in);
        StudentManager stdManager = new StudentManager();
        do {
            System.out.print("""
                               Select a function !
                               1.Add new a student
                               2.View student list
                               3. Find a student by ID
                               4. Update a student
                               5. Exit
                               Select :""");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("enter ID:");
                    ID = sc.next();
                    System.out.print("Full name:");
                    FullName = sc.next();
                    System.out.println("DoB(dd/MM/YYYY):");
                    SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");
                    try {
                        DoB = f.parse(sc.next());
                    } catch (ParseException ex) {
                    }
                    System.out.print("Address:");
                    Address = sc.next();
                    System.out.print("Phone:");
                    Phone = sc.next();
                    Student newStudent = new Student(ID, FullName, DoB, Phone, Address);
                    stdManager.addStudent(newStudent);
                }
                case 2 ->
                    stdManager.printStudentList();
                case 3 -> {
                    System.out.print("ID you want to find: ");
                    String result = sc.next();
                    stdManager.findStudent(result);
                }
                case 4 -> {
                }
                case 5 ->
                    System.exit(0);
                default ->
                    System.out.println("please try again");
            }
        } while (true);
    }

}
