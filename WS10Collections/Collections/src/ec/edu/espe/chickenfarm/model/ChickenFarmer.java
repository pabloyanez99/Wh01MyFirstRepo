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
public class ChickenFarmer {
    
    private String name;
    
    private ChickenCoop[] coops;

    public ChickenFarmer(String name, ChickenCoop[] coops) {
        this.name = name;
        this.coops = coops;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the coops
     */
    public ChickenCoop[] getCoops() {
        return coops;
    }

    /**
     * @param coops the coops to set
     */
    public void setCoops(ChickenCoop[] coops) {
        this.coops = coops;
    }

    @Override
    public String toString() {
        return "ChickenFarmer{" + "name=" + name + ", coops=" + Arrays.toString(coops) + '}';
    }
    
    
}
