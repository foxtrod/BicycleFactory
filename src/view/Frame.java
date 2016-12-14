package view;

import controller.BicycleFactory;

import javax.swing.*;
import java.awt.*;

/**
 * Created by horbachevsky on 13.09.2016.
 */
public class Frame extends JFrame {


    private JFrame frame;

    public Frame(int width, int height, String title, BicycleFactory bicycleFactory) {
        JFrame frame = new JFrame(title);
        frame.setFocusable(true);

        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(bicycleFactory);
        frame.setVisible(true);
        bicycleFactory.start();
    }
}

//    private JButton buttonAddBackWheel = new JButton("Add Front Wheel");
//    private JButton buttonAddFrontWheel = new JButton("Add Back Wheel");
//    private JButton buttonAddChassis = new JButton("Add Chassis");
//    private JButton buttonAddSteeringWheel = new JButton("Add Steering Wheel");
//    private JButton buttonAddSaddle = new JButton("Add saddle");
//    private JButton buttonIsDone = new JButton("Get the bicycle");
//
//    private HandlerOfStates handler;
//
//    private JLabel labelChassis;
//    private JLabel labelBackWheel;
//    private JLabel labelFrontWheel;
//    private JLabel labelSteeringWheel;
//    private JLabel labelSaddle;
//    private JLabel numberOfBicycles = new JLabel();
//
//    private JPanel panel1;
//    private JPanel panel2;
//    private JPanel panel3;
//    private JPanel panel4;
//    private JPanel panel5;
//    private JPanel panel6;




//        buttonIsDone.setBounds(700, 800, 100, 30);
//        frame.add(buttonIsDone);
//
//        buttonAddChassis.setBounds(10, 0, 110, 30);
//        frame.add(buttonAddChassis);
//
//        buttonAddBackWheel.setBounds(150, 0, 130, 30);
//        frame.add(buttonAddBackWheel);
//
//        buttonAddFrontWheel.setBounds(300, 0, 130, 30);
//        frame.add(buttonAddFrontWheel);
//
//        buttonAddSaddle.setBounds(450, 0, 130, 30);
//        frame.add(buttonAddSaddle);
//
//        buttonAddSteeringWheel.setBounds(600, 0, 180, 30);
//        frame.add(buttonAddSteeringWheel);

//        panel1 = new JPanel();
//        panel1.setBounds(100, 300, 250, 250);
//
//        panel2 = new JPanel();
//        panel2.setBounds(400, 300, 250, 250);
//
//        panel3 = new JPanel();
//        panel3.setBounds(700, 300, 250, 250);
//
//        panel4 = new JPanel();
//        panel4.setBounds(300, 600, 250, 250);
//
//        panel5 = new JPanel();
//        panel5.setBounds(600, 600, 250, 250);
//
//
//        labelChassis = new JLabel();
//        labelChassis.setIcon(chassisImage);
//
//        labelBackWheel = new JLabel();
//        labelBackWheel.setIcon(wheelImage);
//
//        labelFrontWheel = new JLabel();
//        labelFrontWheel.setIcon(wheelImage);
//
//        labelSaddle = new JLabel();
//        labelSaddle.setIcon(saddleImage);
//
//        labelSteeringWheel = new JLabel();
//        labelSteeringWheel.setIcon(steeringWheelImage);
//
//
//        frame.add(panel1);
//        frame.add(panel2);
//        frame.add(panel3);
//        frame.add(panel4);
//        frame.add(panel5);
//
//        numberOfBicycles.setText("Number of bicycles: 0");
//        frame.add(numberOfBicycles, BorderLayout.EAST);
//
//
//        frame.setVisible(true);
//
//        factory.start();


//        initListeners(handler);


//    @Override
//    public void paintComponents(Graphics g) {
//        super.paintComponents(g);
//        Graphics g2d = (Graphics2D)g;
//        g2d.drawImage(bicycleImage, 100, 100, null);
//    }
//
//    public void drawBackWheel(BicycleState state) {
//        if (state instanceof BicycleAddChassis) {
//            panel1.add(labelChassis);
//        } else if (state instanceof BicycleAddBackWheel) {
//            panel2.add(labelChassis);
//            panel2.add(labelBackWheel);
//        } else if (state instanceof BicycleAddFrontWheel) {
//            panel3.add(labelChassis);
//            panel3.add(labelBackWheel);
//            panel3.add(labelFrontWheel);
//        } else if (state instanceof BicycleAddSaddle) {
//            panel4.add(labelChassis);
//            panel4.add(labelBackWheel);
//            panel4.add(labelFrontWheel);
//            panel4.add(labelSaddle);
//        } else if (state instanceof BicycleAddSteeringWheel) {
//            panel5.add(labelChassis);
//            panel5.add(labelBackWheel);
//            panel5.add(labelFrontWheel);
//            panel5.add(labelSaddle);
//            panel5.add(labelSteeringWheel);
//        }
//
//    }

//    public void initListeners(HandlerOfStates handler) {
//        buttonAddChassis.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (handler.getBicycleStates().size() == 0) {
//                    handler.addPart(new BicycleAddChassis());
//                    drawBackWheel(new BicycleAddChassis());
//                    frame.revalidate();
//                } else {
//                    JOptionPane.showMessageDialog(null, "Already added", "Warning!", JOptionPane.INFORMATION_MESSAGE);
//                }
//            }
//        });
//        buttonAddBackWheel.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (handler.getBicycleStates().size() == 1) {
//                    handler.addPart(new BicycleAddBackWheel());
//                    drawBackWheel(new BicycleAddBackWheel());
//                    frame.revalidate();
//                } else if (handler.getBicycleStates().size() > 1) {
//                    JOptionPane.showMessageDialog(null, "Already added", "Warning!", JOptionPane.INFORMATION_MESSAGE);
//                } else if (handler.getBicycleStates().size() < 1) {
//                    JOptionPane.showMessageDialog(null, "Add Chassis before it", "Warning!", JOptionPane.INFORMATION_MESSAGE);
//                }
//            }
//        });
//        buttonAddFrontWheel.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (handler.getBicycleStates().size() == 2) {
//                    handler.addPart(new BicycleAddFrontWheel());
//                    drawBackWheel(new BicycleAddFrontWheel());
//                    frame.revalidate();
//                } else if (handler.getBicycleStates().size() > 2) {
//                    JOptionPane.showMessageDialog(null, "Already added", "Warning!", JOptionPane.INFORMATION_MESSAGE);
//                } else if (handler.getBicycleStates().size() < 2) {
//                    JOptionPane.showMessageDialog(null, "Add back wheel before it", "Warning!", JOptionPane.INFORMATION_MESSAGE);
//                }
//            }
//        });
//        buttonAddSaddle.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (handler.getBicycleStates().size() == 3) {
//                    handler.addPart(new BicycleAddSaddle());
//                    drawBackWheel(new BicycleAddSaddle());
//                    frame.revalidate();
//                } else if (handler.getBicycleStates().size() > 3) {
//                    JOptionPane.showMessageDialog(null, "Already added", "Warning!", JOptionPane.INFORMATION_MESSAGE);
//                } else if (handler.getBicycleStates().size() < 3) {
//                    JOptionPane.showMessageDialog(null, "Add front wheel before it", "Warning!", JOptionPane.INFORMATION_MESSAGE);
//                }
//            }
//        });
//        buttonAddSteeringWheel.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (handler.getBicycleStates().size() == 4) {
//                    handler.addPart(new BicycleAddSteeringWheel());
//                    drawBackWheel(new BicycleAddSteeringWheel());
//                    frame.revalidate();
//                    JOptionPane.showMessageDialog(null, "Your bicycle is ready, you can get it", "Good job!", JOptionPane.INFORMATION_MESSAGE);
//                } else if (handler.getBicycleStates().size() > 4) {
//                    JOptionPane.showMessageDialog(null, "Already added", "Warning!", JOptionPane.INFORMATION_MESSAGE);
//                } else if (handler.getBicycleStates().size() < 4) {
//                    JOptionPane.showMessageDialog(null, "Add saddle before it", "Warning!", JOptionPane.INFORMATION_MESSAGE);
//                }
//            }
//        });
//        buttonIsDone.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (handler.isDone()) {
//                    handler.counterOfBicycles();
//                    numberOfBicycles.setText("Number of bicycles: " + Integer.toString(handler.getNumberOfBicycles()));
//                    handler.removeBicycle();
//                    panel5.setVisible(false);
//                    frame.revalidate();
//                    frame.repaint();
//                    JOptionPane.showMessageDialog(null, "Here it is, now you can build another one", "Congratulations!", JOptionPane.INFORMATION_MESSAGE, bicycleImage);
//                } else {
//                    JOptionPane.showMessageDialog(null, "It's not done yet", "Warning!", JOptionPane.INFORMATION_MESSAGE);
//                }
//            }
//        });




