
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Employee {
    private String id;
    private String name;
    private int salary;
    private Date dateOfBirth;

    public Employee(String id, String name, int salary, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dob = sdf.format(dateOfBirth);
        return String.format("ID= %s,name= %s, salary= %d, dob= %tD1%n", id,name,salary,dateOfBirth);
    }
    
}
