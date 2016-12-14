package model;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by horbachevsky on 06.12.2016.
 */
public class RedBicycle implements KindOfBicycle {
    private Image customWheelImage = new ImageIcon("D:\\Programming\\Java\\BicycleFactory\\src\\images\\RedWheel.jpg").getImage();
    private Image chassisImage = new ImageIcon("D:\\Programming\\Java\\BicycleFactory\\src\\images\\Redchassis.jpg").getImage();
    private Image saddleImage = new ImageIcon("D:\\Programming\\Java\\BicycleFactory\\src\\images\\Redsaddle.jpg").getImage();
    private Image steeringWheelImage = new ImageIcon("D:\\Programming\\Java\\BicycleFactory\\src\\images\\RedsteeringWheel.jpg").getImage();
    private ArrayList<Image> imageList = new ArrayList<>();


    public RedBicycle() {
        imageList.add(chassisImage);
        imageList.add(customWheelImage);
        imageList.add(customWheelImage);
        imageList.add(saddleImage);
        imageList.add(steeringWheelImage);
    }

    public ArrayList<Image> getImageList() {
        return imageList;
    }

    public Image getBackWheelImage() {
        return customWheelImage;
    }

    public Image getChassisImage() {
        return chassisImage;
    }

    public Image getFrontWheelImage() {
        return customWheelImage;
    }

    public Image getSaddleImage() {
        return saddleImage;
    }

    public Image getSteeringWheelImage() {
        return steeringWheelImage;
    }
}
