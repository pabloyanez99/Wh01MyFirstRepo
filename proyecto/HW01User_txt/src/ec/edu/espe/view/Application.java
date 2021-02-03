package ec.edu.espe.view;

import ec.edu.espe.controller.newpackage.UserController;
import java.util.Scanner;

/**
 *
 * @author SSS SANTIAGO
 */
public class Application {
    public static void main(String[] args) {
        UserController controller = new UserController();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("1: crear usuario");
            System.out.println("2: Mostrar todos los usuarios");
            System.out.println("3: salir");
            System.out.print("Ingrese la opcion: ");
            
            try {
                option = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception ex) {
                option = -1;
            }
            
            if (option == -1) continue;
            
            System.out.println();
            System.out.println();
            
            if (option == 1) {
                controller.addUser();
            } else if (option == 2) {
                controller.showAllUsers();
            }
            
            System.out.println();
            System.out.println();
        } while (option != 3);
    }
    
}
