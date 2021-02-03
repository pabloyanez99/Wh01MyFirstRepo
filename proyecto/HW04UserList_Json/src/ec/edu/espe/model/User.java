/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author SSS SANTIAGO
 */
public class User {

    private String name;
    private int age;
    private String email;
    private float height;

    public User(String name, int age, String email, float height) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.height = height;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", age=" + age + ", email=" + email + ", height=" + height + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

}
