
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class StudentList {

    private final Map<String, Student> studentMap;

    public StudentList() {
        studentMap = new HashMap<>();
    }

    public void addStudent(Student student) {
        if (studentMap.putIfAbsent(student.getCode(), student) == null) {
            studentMap.put(student.getCode(), student);
            System.out.println("student added successfully.");
        } else {
            System.out.println("student code already exists.");
        }
    }

    public boolean searchStudent(String code) {
        Student student = studentMap.get(code);
        boolean b;
        if (student != null) {
            System.out.println(student.toString());
            return true;
        } else {
            System.out.println("Student not found");
            return false;
        }
    }

    public void removeStudent(String code) {
        Student removedStudent = studentMap.remove(code);
        if (removedStudent != null) {
            System.out.println("Student removed successfully");
        } else {
            System.out.println("Student not found");
        }
    }

    public void displayALLStudent() {
        for (Student student : studentMap.values()) {
            System.out.println(student.toString());
            System.out.println("----------------");
        }
    }

    public void updateStudent(String code, String newName, int newMark) {
        Student student = studentMap.get(code);
        if (student != null) {
            student.setName(newName);
            student.setMark(newMark);
            System.out.println("Student updated successfully");
        } else {
            System.out.println("Student not found");
        }
    }
}
