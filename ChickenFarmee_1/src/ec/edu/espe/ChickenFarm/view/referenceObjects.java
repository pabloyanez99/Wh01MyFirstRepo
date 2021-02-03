/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ChickenFarm.view;
import ec.edu.espe.ChickenFarm.model.Chicken;

/**
 *
 * @author Pablo Yanez CodeMasters ESPE-DCCO
 */
public class referenceObjects {
    public static void main(String[] args){
        Chicken chicken = new Chicken(0,"lucy","black", 0,true);
        System.out.println("chicken -->" + chicken);
        
        int age =4;
        System.out.println("age (integer) -->" + age);
        
        chicken.setAge(age);
        System.out.println("chicken -->" + chicken);
        System.out.println("age (integer-->" + age);
         
        System.out.println("age before calling the method" + age);
        changeValue(age);
        System.out.println("age after calling the method -->" + age);
        changeChicken(chicken);
        System.out.println("chicken ");
    }
    public void changeValue(int value){
        int newValue=8;
        value = newValue;
        
        System.out.println("(inside the method)newValue -->" + newValue); //8   
        System.out.println("(inside the method) value -->" + value);//8
    }
    public static void changeChicken(Chicken ch){
        Chicken localChicken = new Chicken(5, "chiqui", "white",5,false);
        System.out.println("loclaChicken (inside the method-->" + localChicken);
        ch.setName(localChicken.getName());
        System.out.println("chicken parameter (ch) (inside the method");
        
    }
}
