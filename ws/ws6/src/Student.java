/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public final class Student {

    private String code;
    private String name;
    private int mark;

    public Student() {
        this("", "", 0);
    }

    public Student(String code, String name, int mark) {
        this.setCode(code);
        this.setName(name);
        this.setMark(mark);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code.toUpperCase();
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;
        } else {
            throw new IllegalArgumentException("mark invalid");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name.trim().toUpperCase();
        } else {
            throw new IllegalArgumentException("name must not empty");
        }
    }

    @Override
    public String toString() {
        return String.format("code: %s, name: %s, mark: %d", code, name, mark);
    }

}
