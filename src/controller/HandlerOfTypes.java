package controller;

import model.CustomBicycle;
import model.GreenBicycle;
import model.KindOfBicycle;
import model.RedBicycle;

import java.util.ArrayList;

/**
 * Created by horbachevsky on 06.12.2016.
 */
public class HandlerOfTypes {
    private ArrayList<KindOfBicycle> kindOfBicycles = new ArrayList<>();

    public HandlerOfTypes() {
        kindOfBicycles.add(new CustomBicycle());
        kindOfBicycles.add(new GreenBicycle());
        kindOfBicycles.add(new RedBicycle());
    }

    public ArrayList<KindOfBicycle> getKindOfBicycles() {
        return kindOfBicycles;
    }

    public KindOfBicycle getCustom() {
        return kindOfBicycles.get(0);
    }

    public KindOfBicycle getGreen() {
        return kindOfBicycles.get(1);
    }

    public KindOfBicycle getRed() {
        return kindOfBicycles.get(2);
    }


}
