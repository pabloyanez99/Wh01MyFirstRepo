/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Pablo Yanez CodeMasters ESPE-DCCO
 */
public class AntEater {
    private Cell position;
    private int antEatCounter;
    private int runCounter;
    private Enum state;
    
public void run(){
    
}
public Cell getPosition(){
    return position;
}

public void setPosition(Cell position){
    this.position = position;
}
public int getAntEatCounter(){
    return antEatCounter;
}
}
