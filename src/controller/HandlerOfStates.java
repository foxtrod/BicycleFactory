package controller;

import model.BicycleState;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by horbachevsky on 06.10.2016.
 */
public class HandlerOfStates {

    private ArrayList<BicycleState> bicycleStates = new ArrayList<>();
    private Integer countOfBicycles = 0;
//    private CustomBicycle customBicycle;
    private HandlerOfTypes handlerOfTypes = new HandlerOfTypes();

    public HandlerOfStates() {

    }

    public void addPart(BicycleState state) {
        bicycleStates.add(state);
    }

    public boolean isDone() {
        return (bicycleStates.size() == 5);
    }

    public void counterOfBicycles() {
        this.countOfBicycles++;
    }

    public ArrayList<BicycleState> getBicycleStates() {
        return bicycleStates;
    }

    public void removeBicycle() {
        bicycleStates.clear();
    }

    public void render(Graphics g) {
        for (int i = 0; i < bicycleStates.size(); i++) {
            BicycleState state = bicycleStates.get(i);
            state.render(g, handlerOfTypes.getRed().getImageList().get(i));
//            state.render(g, handlerOfTypes.getCustom().getImageList().get(i));
//            BicycleState state1 = bicycleStates.get(i);
//            state1.render(g, handlerOfTypes.getGreen().getImageList().get(i));
//            //            state.render(g, customBicycle.getImageList().get(i));
        }
    }

    public Integer getNumberOfBicycles() {
        return countOfBicycles;
    }

    public void removePart(BicycleState state) {
        bicycleStates.remove(state);
    }

    public BicycleState getPart(int index) {
        return bicycleStates.get(index);
    }


}

