/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05antsimulator3248;

import ec.edu.espe.antsimulator.model.Area;
import ec.edu.espe.filemanager.utils.FileManager;


/**
 *
 * @author Pablo Yanez CodeMasters ESPE-DCCO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Area area= new Area();
       
        area.setHeight(10);
        area.setInitNumberOfFoodpiles(2);
        area.setTickDuration(1000);
        area.setWidth(20);
        
     
        FileManager.save("students.csv","Pablo Yanez, 21,25,17,19");
        FileManager.find("students.csv","Pablo Yanez");
        FileManager.findAll("students.csv");
        
        }
    }
    

    

