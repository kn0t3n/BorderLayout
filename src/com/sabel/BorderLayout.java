package com.sabel;

import javax.swing.*;
import java.awt.*;

public class BorderLayout extends JFrame {


    public BorderLayout() throws HeadlessException {
        this.setTitle("BorderLayout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.initComponents();
        this.setVisible(true);
    }


    public void initComponents() {

        JPanel jPNorth = new JPanel();
        JPanel jPSouth = new JPanel();
        JPanel jPWest = new JPanel();
        JPanel jPEast = new JPanel();
        JPanel jPCenter = new JPanel();



        this.add(jPNorth);

        this.add(new JLabel("South"), java.awt.BorderLayout.SOUTH);

        this.add(new JLabel("East"), java.awt.BorderLayout.EAST);

        this.add(new JLabel("West"), java.awt.BorderLayout.WEST);

        this.add(new JLabel("Center"), java.awt.BorderLayout.CENTER);


    }
}


