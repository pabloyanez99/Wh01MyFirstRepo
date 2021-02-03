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
public class Area {

    
    private int height;
    private int width;
    private int initNumberOfFoodPiles;
    private int tick_Duration;
    @Override
    public String toString() {
        return height + "," + width + "," + initNumberOfFoodPiles + "," + tick_Duration ;
    }
    
    public void setup(){
        
    }
    
    public void add(Colony colony){
        
    }
    public void add(AntEater antEater){
        
    }
    
    public boolean isAnyFoodRemaining(){
        
        return true;
    }
    public Cell getCell(int row,int col){
        Cell cell = new Cell();
        return cell;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the initNumberOfFoodPiles
     */
    public int getInitNumberOfFoodPiles() {
        return initNumberOfFoodPiles;
    }

    /**
     * @param initNumberOfFoodPiles the initNumberOfFoodPiles to set
     */
    public void setInitNumberOfFoodPiles(int initNumberOfFoodPiles) {
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
    }

    /**
     * @return the tick_Duration
     */
    public int getTick_Duration() {
        return tick_Duration;
    }

    /**
     * @param tick_Duration the tick_Duration to set
     */
    public void setTick_Duration(int tick_Duration) {
        this.tick_Duration = tick_Duration;
    }

    public void setIniNumberOfFoodpiles(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTickDuration(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setInitNumberOfFoodpiles(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


