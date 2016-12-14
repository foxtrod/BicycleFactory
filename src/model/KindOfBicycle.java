package model;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by horbachevsky on 06.12.2016.
 */
public interface KindOfBicycle {
    public ArrayList<Image> getImageList();
    public Image getBackWheelImage();
    public Image getChassisImage();
    public Image getFrontWheelImage();
    public Image getSaddleImage();
    public Image getSteeringWheelImage();
}
