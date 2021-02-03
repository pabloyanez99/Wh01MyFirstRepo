/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.student.view;

import ec.edu.espe.student.controller.StudentActivity;
import java.util.Scanner;

/**
 *
* @author Pablo Yanez ESPE-DCCO
 */
public class StudentAttendance {

    public static void main(String[] args) {
        Scanner sacanner = new Scanner(System.in);
        StudentActivity controller = new StudentActivity();
        int opc;
        do {
            System.out.println("**REGISTRO DE ASISTENCIA DE ESTUDIANTES**");
            System.out.println("1. INGRESAR ESTUDIANTE");
            System.out.println("2. VER REGISTRO DEL ESTUDIANTE");
            System.out.println("3. SALIR");
            System.out.println("INGRESE UNA OPCION: ");
            opc = sacanner.nextInt();
            switch (opc) {
                case 1:
                    controller.enterStudent();
                    break;
                case 2:
                    controller.showAttendance();
                    break;
                case 3:
                    System.out.println("GRACIAS POR USAR MI PROGRAMA");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion incorrecta...!!");
            }

        } while (opc != 0);

    }

}
