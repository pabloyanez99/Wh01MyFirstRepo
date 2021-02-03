/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Pablo Yanez CodeMasters ESPE-DCCO
 */
public class B {
    private ArrayList<G> gs = new ArrayList <>();
    private H[] hs = new H[3];

    public B(ArrayList <G> gs , H[] hs ) {
        this.gs =gs;
        
    }

    @Override
    public String toString() {
        //fot fot printing every H and put them in the hs  String
        return "B{" + "gs=" + gs + ", hs=" + Arrays.toString(hs) + '}';
    }

    
    
    /**
     * @return the gs
     */
    public ArrayList<G> getGs() {
        return gs;
    }

    /**
     * @param gs the gs to set
     */
    public void setGs(ArrayList<G> gs) {
        this.gs = gs;
    }

    /**
     * @return the hs
     */
    public H[] getHs() {
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(H[] hs) {
        this.hs = hs;
    }
    
    
    
}
