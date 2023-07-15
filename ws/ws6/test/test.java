/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class test {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();

        // Adding students to the list
        Student student1 = new Student("S001", "John Doe", 1);
        Student student2 = new Student("S002", "Jane Smith", 2);
        Student student3 = new Student("S003", "Alex Johnson", 9);
        studentList.addStudent(student1);
        studentList.addStudent(student2);
        studentList.addStudent(student3);

        // Searching for students
        studentList.searchStudent("S001");
        studentList.searchStudent("S002");
        studentList.searchStudent("S003");
        studentList.searchStudent("S004"); // Testing for a student that doesn't exist

        // Removing a student
        studentList.removeStudent("S002");
        studentList.updateStudent("S001", "John Smith", 10);
        studentList.displayALLStudent();
}
}