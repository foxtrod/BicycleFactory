package model;

import javax.swing.*;
import java.awt.*;

/**
 * Created by horbachevsky on 13.09.2016.
 */
public class BicycleAddBackWheel implements BicycleState {

    private Image customWheelImage = new ImageIcon("D:\\Programming\\Java\\BicycleFactory\\src\\images\\wheel.jpg").getImage();
    private Image redWheelImage = new ImageIcon("D:\\Programming\\Java\\BicycleFactory\\src\\images\\Redwheel.jpg").getImage();


    private int x;
    private int y;

    public BicycleAddBackWheel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 48, 50);
    }

    public void render(Graphics g, Image image) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.red);
        g2d.draw(getBounds());
        g.drawImage(image, x, y, null);
    }


   public void setCoordinates(int x, int y) {
       this.x = x;
       this.y = y;
   }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
//    public void move() {
//        this.x += 1;
//    }

}
