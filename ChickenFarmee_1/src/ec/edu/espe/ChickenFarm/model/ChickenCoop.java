/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ChickenFarm.model;

import java.util.Arrays;

/**
 *
 * @author Cristian Maranje ESPE-DCCO
 */
public class ChickenCoop {
    private int id;
    private Chicken chickens[];

    public ChickenCoop(int id, Chicken[] chickens) {
        this.id = id;
        this.chickens = chickens;
        System.out.println(chickens[0]);
    }

    @Override
    public String toString() {
        return "ChickenCoop{" + "id=" + id + ", chickens=" + Arrays.toString(chickens) + '}';
    }

    
    
    
    public int getId() {
        return id;
    }

    public Chicken[] getChickens() {
        return chickens;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setChickens(Chicken[] chickens) {
        this.chickens = chickens;
    }
    
    
    
   
    
}
