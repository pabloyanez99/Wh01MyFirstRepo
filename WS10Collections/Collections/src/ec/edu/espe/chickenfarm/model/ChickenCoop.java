/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.chickenfarm.model;

import java.util.Arrays;

/**
 *
 * @author Pablo Yanez CodeMasters ESPE-DCCO
 */
public class ChickenCoop {
    private int id;
    private Chicken chichens[];

    public ChickenCoop(int id, Chicken[] chichens) {
        this.id = id;
        this.chichens = chichens;
    }

   
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the chichens
     */ 
    public Chicken[] getChichens() {
        return chichens;
    }

    /**
     * @param chichens the chichens to set
     */
    public void setChichens(Chicken[] chichens) {
        this.chichens = chichens;
    }

    @Override
    public String toString() {
        return "ChickenCoop{" + "id=" + id + ", chichens=" + Arrays.toString(chichens) + '}';
    }
    
}
