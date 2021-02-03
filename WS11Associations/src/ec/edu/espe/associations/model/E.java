/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

import java.util.ArrayList;

/**
 *
 * @author Pablo Yanez CodeMasters ESPE-DCCO
 */
public class E {
    
    private A a;
   
    public B m3(){
        ArrayList<G> gs = new ArrayList <>();
        H hs[]= new H[3];
        B b = new B(gs , hs);
        System.out.println("returning B from E.m3()");
        return b;
    }
    
    

    @Override
    public String toString() {
        return "E{" + "a=" + a + '}';
    }
    
    

    public E(A a) {
        this.a = a;
    }

    /**
     * @return the a
     */
    public A getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(A a) {
        this.a = a;
    }
    
}
