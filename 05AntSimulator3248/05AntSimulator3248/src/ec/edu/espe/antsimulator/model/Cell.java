/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pablo Yanez CodeMasters ESPE-DCCO
 */
public class Cell {
    int row;
    int col;

public void receivePheromone(PheromoneDrop pheromoneDrop){
    
    
}

public List<Ant> getAnts(){
    List<Ant> ants = new ArrayList<>();
    ants.add(new Ant());
    ants.add(new Ant());
    ants.add(new Ant());
    ants.add(new Ant());
    ants.add(new Ant());
    ants.add(new Ant());
    ants.add(new Ant());
    ants.add(new Ant());
    ants.add(new Ant());
    ants.add(new Ant());
    ants.add(new Ant());
    ants.add(new Ant());
    
    //TODO code to read the ants
    return ants;
}

public Ant[] getAnts2(){
    Ant[] ants = new Ant [5];
    ants[0] = new Ant();
    ants[1] = new Ant();
    ants[2] = new Ant();
    ants[3] = new Ant();
    ants[4] = new Ant();
    ants[5] = new Ant();
    ants[6] = new Ant();
    
    return ants;
    
}
    
}
