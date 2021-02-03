/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ChickenFarm.model;

/**
 *
 * @author Cristian Maranje ESPE-DCCO
 */
public class Egg {
    private int num;

    public Egg(int num) {
        this.num = num;
    }

    public Egg(){
        int num = 1;
    }
    
    @Override
    public String toString() {
        return "Egg{" + "num=" + num + '}';
    }

    
    
    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }
    
    
}
