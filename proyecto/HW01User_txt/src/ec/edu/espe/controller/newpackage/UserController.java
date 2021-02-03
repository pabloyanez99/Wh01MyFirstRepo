/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller.newpackage;

import ec.edu.espe.model.User;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SSS SANTIAGO
 */
public class UserController {
    public UserController() {
        try {
            File file = new File("users.txt");
        
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
        Path filePath = Paths.get("users.txt");
        
        try {
            String linea = user.toString() + "\n";
            Files.write(filePath, linea.getBytes(), StandardOpenOption.APPEND);
        } catch (Exception exception) {
            System.out.println("Error: Cannot write to file '" + exception.getMessage() + "'");
        }
    }
    
  
    public void showAllUsers() {
        try {
            Path filePath = Paths.get("users.txt");
            List<String> lines =  Files.readAllLines(filePath);
            
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (Exception exception) {
            System.out.println("Error: No se pudo leer el fichero" );
        }
    }
}
