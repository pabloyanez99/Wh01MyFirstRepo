/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.student.model;

/**
 *
 * @author Pablo Yanez ESPE-DCCO
 */
public class Student {
    private String name;
    private String lastName;
    private int age;
    private String matter;
    private String date;
    private String attendance;

    public Student(String name, String lastName, int age, String matter, String date, String attendance) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.matter = matter;
        this.date = date;
        this.attendance = attendance;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the matter
     */
    public String getMatter() {
        return matter;
    }

    /**
     * @param matter the matter to set
     */
    public void setMatter(String matter) {
        this.matter = matter;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the attendance
     */
    public String getAttendance() {
        return attendance;
    }

    /**
     * @param attendance the attendance to set
     */
    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return name + "," + lastName + "," + age + "," + matter + "," + date + "," + attendance ;
    }
    
    public String toNewString() {
        return name + "," + lastName + "," + age + "," + matter + "," + date + "," + attendance ;
    }

    
}
