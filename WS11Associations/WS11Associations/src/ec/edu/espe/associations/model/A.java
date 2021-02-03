/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

/**
 *
 * @author Ariel Nicolás Hidrobo Fernández
 */
public class A {
    private B[] bs = new B[5];

    public A(B[] bs) {
        this.bs =bs;
    }

    @Override
    public String toString() {
        return "A{" + "bs=" + bs + '}';
    }

    /**
     * @return the bs
     */
    public B[] getBs() {
        return bs;
    }

    /**
     * @param bs the bs to set
     */
    public void setBs(B[] bs) {
        this.bs = bs;
    }
    
    
    
}
