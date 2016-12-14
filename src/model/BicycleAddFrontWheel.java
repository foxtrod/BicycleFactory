package model;

import java.awt.*;

/**
 * Created by horbachevsky on 20.10.2016.
 */
public class BicycleAddFrontWheel implements BicycleState {

    private int x, y;

    public BicycleAddFrontWheel(int x, int y) {
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

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    public void move() {
//        this.x += 50;
//    }
}
