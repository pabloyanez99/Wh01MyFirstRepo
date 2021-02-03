/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.student.controller;

import ec.edu.espe.student.model.Student;
import ec.edu.espe.student.view.AttendanceView;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
* @author Pablo Yanez ESPE-DCCO
 */
public class StudentActivity {

    public Student newStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante: ");
        String name = scanner.nextLine();

        System.out.println("Ingrese el apellido del estudiante: ");
        String lastname = scanner.nextLine();
        System.out.println("Ingrese la edad del estudiante: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Ingrese la materia: ");
        String matter = scanner.nextLine();

        System.out.println("Ingrese la fecha de asistencia: ");
        String date = scanner.nextLine();

        System.out.println("Ingrese el estado de asistencia: ");
        String attendance = scanner.nextLine();

        Student student = new Student(name, lastname, age, matter, date, attendance);
        return student;
    }

    public boolean addStudent(Student student) {
        List<Student> students = keepList();
        try {
            FileWriter Filetxt = new FileWriter("StudentAttendance.txt");
            students.add(student);//añadir estudiante
            /*if (!Filetxt.exists()) {
                Filetxt.createNewFile();
            }*/
            BufferedWriter bw = new BufferedWriter (Filetxt);
            PrintWriter printer = new PrintWriter(bw); //Escribir en el archivo
            for(Student studentObject : students){
                printer.println(studentObject.toNewString());
            }
            printer.close();
        } catch (IOException ex) {
            System.err.println("Error...!!! No se puede guardar estudiantes..");
 
            return false;
        }
        return true;
    }

    public List<Student> keepList() {
        ArrayList<Student> students = new ArrayList<>();
        try{
            FileReader f = new FileReader("StudentAttendance.txt");//leer un archivo
            BufferedReader b = new BufferedReader(f); 
            Student findStudents;
            String lineFile; //lineas dentro del archivo
            while((lineFile=b.readLine())!=null){
                String student[]=lineFile.split(",");
                findStudents = new Student(student[0], student[1], Integer.valueOf(student[2]), student[3], student[4],student[5]);
                students.add(findStudents);
            }
        }catch (IOException ex) {
        }
        return students;
    }
    public void enterStudent(){
        addStudent(newStudent());
    }
    public void showAttendance(){
        List<Student> students = keepList();
        for(Student student : students){
            AttendanceView view = new AttendanceView(student);
            view.display();      
        }
    } 
}
