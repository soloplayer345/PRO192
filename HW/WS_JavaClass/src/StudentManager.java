/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class StudentManager {

    //khai bao mang chua danh sach sinh vien
    Student studentList[] = new Student[50];
    //so sinh vien da luu tru
    int numOfStudent = 0;

    //phuong thuc lay sinh vien theo index
    public Student getStudentByIndex(int index) {
        return studentList[index];
    }

    //them sinh vien moi
    public int addStudent(Student newStudent) {
        if (numOfStudent < studentList.length) {
            studentList[numOfStudent++] = newStudent;
            return 1;
        } else {
            return 0;
        }
    }
    public void printStudentList(){
        System.out.println("Student List :");
        for (int i = 0; i <numOfStudent; i++) {
            System.out.println(studentList[i].toString());
        }
    }
    //end addStudent
    //Tim sinh vien theo ID
    public int findStudent(String ID){
        int result =0;
        for (int i = 0; i <numOfStudent; i++) {
            if (studentList[i].getmID().equals(ID)) {
                System.out.println(studentList[i].toString());
            }
        }
        return result;
    }
    public void updateStudent(Student newStudent){//tìm sinh viên rồi update lại cái sinh viên theo id đó nếu ko có ghi not found
//        findStudent();
    }
}
