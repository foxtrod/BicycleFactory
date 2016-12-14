package model;

import java.awt.*;

/**
 * Created by horbachevsky on 12.09.2016.
 */
public interface BicycleState {

    public void render(Graphics g, Image image);

    public int getX();

    public int getY();

    public void setCoordinates(int x, int y);

}
