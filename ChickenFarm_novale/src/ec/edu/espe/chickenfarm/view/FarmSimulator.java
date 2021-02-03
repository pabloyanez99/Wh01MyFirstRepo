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


/**
 *
 * @author Pablo Yanez CodeMasters ESPE-DCCO
 */
public class FarmSimulator {

    public static void main(String[] args){
        
        Egg egg;
        egg = new Egg(1);
        System.out.println("egg -->" + egg);
        Chicken chicken = new Chicken(1,"Sofia","black", 1, true);
        Chicken chicken2 = new Chicken(2, "Rodolfin", "red", 2, true);
        Chicken chicken2 = new Chicken(3, "Pepin", "red", 3, true);
        System.out.println("chicken Sofia" + chicken1);
        
        Chicken[] chickens = new Chicken[3];
        chickens[0]=chicken1;
        chickens[1]=chicken2;
        chickens[2]=chicken3;
        
        System.out.println("chicken (0) -->" + chickens[0]);
        System.out.println("chicken (1) -->" + chickens[1]);
        System.out.println("chicken (2) -->" + chickens[2]);
        
        ChickenCoop coop1= new ChickenCoop(01,chickens);
        
        ChickenFarmer farmer = new ChickenFarmer("Pedro",coop1);
        System.out.println(farmer);  
        try {
            System.out.println("chicken (0) -->" + chickens[10]);
        }catch(Exception ex){
            System.out.println("Oiga, el porgrama solo acepta 5 pollitos");
        }        
    }
}

