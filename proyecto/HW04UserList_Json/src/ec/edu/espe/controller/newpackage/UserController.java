/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller.newpackage;

import com.google.gson.Gson;
import ec.edu.espe.model.User;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SSS SANTIAGO
 */


public class UserController {
    private Gson gson = new Gson();
    
    public UserController() {
        try {
            File file = new File("users.json");
        
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception exception) {
            System.out.println("Error: no se pudo crear el archivo users.txt");
        }
    }
    
    public User createUser(){
         Scanner scanner = new Scanner(System.in);
         String name;
         int age;
         String email;
         float height;
         
         System.out.println("Ingrese su nombre");
         name = scanner.nextLine();
         
         System.out.println("Ingrese su email");
         email = scanner.nextLine();
         
         System.out.println("Ingrese su edad");
         age = scanner.nextInt();
         scanner.nextLine();
         
         System.out.println("Ingrese su estatura");
         height = scanner.nextFloat();
         scanner.nextLine();
         
         User user = new User(name, age, email, height);
         
         return user;
    
    }
    
    public void addUser(){
        User user = createUser();
        
        List<User> users = getAllUsers();
        users.add(user);
        
        Path filePath = Paths.get("users.json"); //ruta del archivo
        
        try {
            String jsonFormat = gson.toJson(users);
            Files.write(filePath, jsonFormat.getBytes(), StandardOpenOption.TRUNCATE_EXISTING); 
        } catch (Exception exception) {
            System.out.println("Error: Cannot write to file '" + exception.getMessage() + "'");
        }
    }
    
    public List<User> getAllUsers() {
        List<User> usersList = new ArrayList<>();
        Path filePath = Paths.get("users.json");
        
        try {
            byte bytes[] =  Files.readAllBytes(filePath);
            String jsonFormat = new String(bytes);

            User users[] = gson.fromJson(jsonFormat, User[].class);
            usersList.addAll(Arrays.asList(users));
        } catch (Exception exception) {
            System.out.println("Error reading all users");
        }
        
        return usersList;
    }
    
    public void showAllUsers() { //mostrar usuarios
        List<User> users = getAllUsers();
        List data;
                data = new ArrayList();

                data.add(new User("Mario", 20, "f10_pm@hotmail.com", 1.70F));
                data.add("Vanessa");
                data.add(30);
                data.add("vnzurita@espe.edu.ec");
                data.add(1.64F);

                System.out.println("==========================");
                System.out.println("size of my things ArraysList --> " + data.size());
                System.out.println("My new user --> " + data);

                System.out.println("--> trying to remove a float-->" + data.remove(1.64F));
                System.out.println("==========================");
                System.out.println("size of my things ArraysList --> " + data.size());
                System.out.println("My ArrayList things contains --> " + data);

                data.add(4, 1.10F);
                System.out.println("==========================");
                System.out.println("size of my things ArrayList -->" + data.size());
                System.out.println("My ArrayList things contains -->" + data);

        
        for (User user : users) {
            System.out.println(user);
        }
    }
    
}
