/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.student.view;

import ec.edu.espe.student.model.Student;

/**
 *
* @author Pablo Yanez ESPE-DCCO
 */
public class AttendanceView {
     Student student;

    public AttendanceView(Student student) {
        this.student = student;
    }
    public void display(){
        System.out.println("***********************");
        System.out.println("Nombre: "+ student.getName());
        System.out.println("Apellido: "+student.getLastName());
        System.out.println("Edad: "+student.getAge());
        System.out.println("Materia: "+student.getMatter());
        System.out.println("Fecha: "+student.getDate());
        System.out.println("Asitencia: "+student.getAttendance());
        System.out.println("************************");
    }
    
}
