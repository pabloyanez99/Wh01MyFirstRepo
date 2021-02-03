/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.chickenfarm.view;


import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.ChickenCoop;
import ec.edu.espe.chickenfarm.model.ChickenFarmer;
import ec.edu.espe.chickenfarm.model.Egg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Pablo Yanez CodeMasters ESPE-DCCO
 */
public class FarmSimulator {
    
    public static void main(String[] args) {
        Egg egg;
        egg = new Egg(1);
        
        System.out.println("egg ->"+ egg);
        
        Chicken chicken = new Chicken(0, "Grace", "write", 1, true);
        
        System.out.println(chicken);
        
        
        Chicken[] chickens= new Chicken[5];
     
       
        chickens[1]= new Chicken(1,"Massimo", "black",1,true);
        
        chickens[2]= new Chicken(2,"Pinocho", "green",2,false);
        
        chickens[3]= new Chicken(3,"Paul", "brown",3,true);
        
        chickens[4]= new Chicken(4,"chicho", "blue",4,false);
        
         System.out.println("chicken(0) ->"+ chickens[0]);
         System.out.println("chicken(0) ->"+ chickens[1]);
         
    
         try{
         System.out.println("chicken(0) ->"+ chickens[5]);
         }
         catch (Exception ex){
             System.out.println("Oiga, no acepta mas de 5 pollitos");

         }
         
         ChickenCoop[] chickenCoops = new ChickenCoop[2];
        
        chickenCoops[0] = new ChickenCoop(1,chickens);
        chickenCoops[1] = new ChickenCoop(1,chickens);
        
        //System.out.println(Arrays.toString(chickenCoops));
        
        ChickenFarmer farmer = new ChickenFarmer("Jose", chickenCoops);
        
        //System.out.println(farmer.toString());
        
         
        List things;
        things = new ArrayList();
        
        List otherThings;
        otherThings = new ArrayList();
        
        things.add(24520);
        things.add("Pablo Yanez");
        things.add(20.15F);
        things.add(new Chicken(6,"David","black",3,true));
        things.add(chicken);
        things.add(egg);
        System.out.println("=====================");
        System.out.println("size of my things ArrayList --->" + things.size());
        
        System.out.println("======================");
        System.out.println("My ArrayList things contain --->" + things);
        
        try{
            things.remove(24520);
            System.out.println("======================");
            System.out.println("size of my things ArrayList --->" + things.size());
            System.out.println("My ArrayList things contain --->" + things);
            System.out.println("Element 24520 was removed");
        }catch(Exception ex){
            System.out.println("Element --> 24521 does not exist");
        }
        
        things.add(20000);
       System.out.println("======================");
            System.out.println("size of my things ArrayList --->" + things.size());
            System.out.println("My ArrayList things contain --->" + things);
       
        Integer dataToRemove = new Integer(2000);
        things.add(dataToRemove);
        System.out.println("======================");
        System.out.println("size of my things ArrayList --->" + things.size());
        System.out.println("My ArrayList things contain --->" + things);
        
        things.add(0,19);
        System.out.println("======================");
        System.out.println("size of my things ArrayList --->" + things.size());
        System.out.println("My ArrayList things contain --->" + things);
        
        things.add(2,5230.34F);
        System.out.println("======================");
        System.out.println("size of my things ArrayList --->" + things.size());
        System.out.println("My ArrayList things contain --->" + things);
    }
}