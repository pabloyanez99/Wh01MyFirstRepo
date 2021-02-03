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
    private String name;
    private boolean busy;

    @Override
    public String toString() {
        return "Area{" + "height=" + height + ", width=" + width + ", initNumberOfFoodPiles=" + initNumberOfFoodPiles + ", tick_Duration=" + tick_Duration + ", name=" + name + ", busy=" + busy + '}';
    }

    /**
     *
     */
    public Area() {
        width = 20;
        height = 20;
        initNumberOfFoodPiles = 1;
        tick_Duration = 1000;
        name = "area01";
        busy = true;
    }

    public Area(int height, int width, int initNumberOfFoodPiles, int tick_Duration, String name, boolean busy) {
        this.height = height;
        this.width = width;
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
        this.tick_Duration = tick_Duration;
        this.name = name;
        this.busy = busy;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public void setup() {

    }

    public void add(Colony colony) {

    }

    public void add(AntEater antEater) {

    }

    public boolean isAnyFoodRemaining() {

        return true;
    }

    public Cell getCell(int row, int col) {
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
}
