
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class DemoComparator {
    static void  printList(List<Employee> l){
        for (Employee emp : l) {
            System.out.println(emp);
        }
    }
    static Date getDateFormString (String date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = null;
        try {
         d = sdf.parse(date);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        return d;
    }
    public static void main(String[] args) {
        ArrayList<Employee> arrayList =new ArrayList<>();
        arrayList.add(new Employee("ID003", "Chaitanya", 25, getDateFormString("12/10/1990")));
        arrayList.add(new Employee("ID002", "Rahul", 28, getDateFormString("20/8/1990")));
        arrayList.add(new Employee("ID001", "Ajeet", 25, getDateFormString("11/07/1990")));
        System.out.println("Sorting on salary descending");
 Collections.sort(arrayList, ( e1, e2) ->  e2.getSalary() - e1.getSalary());
        printList(arrayList);
    }
}
