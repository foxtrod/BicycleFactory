package controller;

import view.Frame;

import java.awt.*;
import java.awt.image.BufferStrategy;


public class BicycleFactory extends Canvas implements Runnable {


    private HandlerOfStates handlerOfStates;
    private Constructing constructing;
    private HandlerOfTypes handlerOfTypes;
    private Frame frame;
    private Thread thread;
    private boolean running = false;
    private int WIDTH = 1400, HEIGHT = WIDTH / 12 * 9;
    private int delta = 0;


    public BicycleFactory() {

        handlerOfTypes = new HandlerOfTypes();
        handlerOfStates = new HandlerOfStates();
        constructing = new Constructing(handlerOfStates);
        frame = new Frame(WIDTH, HEIGHT, "Bicycle Factory", this);
    }

    public void start() {
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public synchronized void stop() {
        try {
            thread.join();
            running = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while (running) {
//            long now = System.nanoTime();
//            delta += (now - lastTime) / ns;
//            lastTime = now;

            if (running) {
                render();
            }
            while (delta >= 1) {

                construct();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                delta--;
                render();

            }

            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                frames = 0;
            }
        }

        stop();

    }

    public void construct() {
        constructing.typeOfBicycle(handlerOfTypes.getKindOfBicycles().get(0)); //тут координаты
        constructing.createBicycle();
    }

    public void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();

        if (handlerOfStates.getBicycleStates().size() == 0) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, WIDTH, HEIGHT);
        }

        handlerOfStates.render(g);


        g.dispose();
        bs.show();

        delta++;
    }

    public static void main(String[] args) {


        new BicycleFactory();

        //��������� ����� ������, ������ ������,

    }
}
