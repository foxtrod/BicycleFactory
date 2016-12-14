package controller;

import model.*;

/**
 * Created by horbachevsky on 04.12.2016.
 */
public class Constructing {

    private HandlerOfStates handlerOfStates;
    private int x, y;

    public Constructing(HandlerOfStates handlerOfStates) {
        this.handlerOfStates = handlerOfStates;
    }

    public void typeOfBicycle(KindOfBicycle kindOfBicycle) {
        if (kindOfBicycle instanceof GreenBicycle) {
            greenConstruct();

        } else if (kindOfBicycle instanceof RedBicycle) {
            redConstuct();

        } else if (kindOfBicycle instanceof CustomBicycle){
            customConstuct();
        }
    }

    public void createBicycle() {

        if (handlerOfStates.getBicycleStates().size() == 0) {
            handlerOfStates.addPart(new BicycleAddChassis(x, y));
        } else if (handlerOfStates.getBicycleStates().size() == 1) {
            handlerOfStates.getPart(0).setCoordinates(x += 100, y);
            handlerOfStates.addPart(new BicycleAddBackWheel(x += 50, y));
        } else if (handlerOfStates.getBicycleStates().size() == 2) {
            handlerOfStates.getPart(0).setCoordinates(x += 250, y);
            handlerOfStates.getPart(1).setCoordinates(x += 50, y);
            handlerOfStates.addPart(new BicycleAddFrontWheel(x += 50, y));
        } else if (handlerOfStates.getBicycleStates().size() == 3) {
            handlerOfStates.getPart(0).setCoordinates(x += 450, y);
            handlerOfStates.getPart(1).setCoordinates(x += 50, y);
            handlerOfStates.getPart(2).setCoordinates(x += 50, y);
            handlerOfStates.addPart(new BicycleAddSteeringWheel(x += 50, y));
        } else if (handlerOfStates.getBicycleStates().size() == 4) {
            handlerOfStates.getPart(0).setCoordinates(x += 700, y);
            handlerOfStates.getPart(1).setCoordinates(x += 50, y);
            handlerOfStates.getPart(2).setCoordinates(x += 50, y);
            handlerOfStates.getPart(3).setCoordinates(x += 50, y);
            handlerOfStates.addPart(new BicycleAddSaddle(x += 50, y));
        } else if (handlerOfStates.isDone()) {
            handlerOfStates.removeBicycle();
            handlerOfStates.counterOfBicycles();
        }
    }


    public void customConstuct() {
        this.x = 100;
        this.y = 100;
    }

    public void greenConstruct() {
        this.x = 100;
        this.y = 300;
    }

    public void redConstuct() {
        this.x = 100;
        this.y = 500;
    }
}

