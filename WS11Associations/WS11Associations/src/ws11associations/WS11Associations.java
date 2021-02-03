/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11associations;

import ec.edu.espe.associations.model.A;
import ec.edu.espe.associations.model.B;
import ec.edu.espe.associations.model.D;
import ec.edu.espe.associations.model.E;
import ec.edu.espe.associations.model.G;
import ec.edu.espe.associations.model.H;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Ariel Nicolás Hidrobo Fernández
 */
public class WS11Associations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        B[] bs = new B[5];
        A a;
        E e;
        D d;
        
        bs= new B[5];
        a= new A(bs);
        e= new E(a);
        
        ArrayList<G> gs = new ArrayList<>();
         H[] hs = new H[5];
      
         gs = new ArrayList<>();
    
        for (int i=0 ; i<bs.length;i++){
           bs[i]= new B(gs, hs);
        }
        for (int i=0 ; i<bs.length;i++){
            hs[i]= new H();
        }
        
        gs.add(new G());
        gs.add(new G());
        
        System.out.println("bs -->" +bs);
        System.out.println("A -->" +a );
        System.out.println("E -->" +e );
 
         d = new D();
         
         System.out.println("D-->" +d);
            
         d.m2(bs [0]);
         d.m2(a,12);
    }   
}
