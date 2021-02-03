/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06antsimulator3248;

import ec.edu.espe.antsimulator.model.Area;

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
        
        Area area;
        area= new Area();
        
        System.out.println("area object -->"+ area);
        
        Area area1 = new Area(80, 100, 5, 5000, "area51",false);
        System.out.println("area1 object -->" + area1);
        Area area2;
        area2 = new Area();
        
        area2.setName("area71");
        
        System.out.println("area2 object -->" + area2);
        
        area2.setHeight(50);
        System.out.println("area2 object -->" + area2);
        
        area1.setBusy(true);
        System.out.println("area1 object -->" + area1);
        
        int height; // variable declaration
        height = 15; // initialization
       
        area.setInitNumberOfFoodPiles(2);
        area.setHeight(10);
        area.setTick_Duration(1000);
        area.setWidth(20);
        String dataToSave;
        dataToSave = area.getHeight()+","+ area.getWidth();
        
        
    }
}  
    

    