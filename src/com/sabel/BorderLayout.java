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

        JLabel jLNorth = new JLabel("North");
        JLabel jLSouth = new JLabel("South");
        JLabel jLEast = new JLabel("East");
        JLabel jLWest = new JLabel("West");
        JLabel jLCenter = new JLabel("Center");

        jPNorth.add(jLNorth);
        jPSouth.add(jLSouth);
        jPEast.add(jLEast);
        jPWest.add(jLWest);
        jPCenter.add(jLCenter);

        this.add(jPNorth, java.awt.BorderLayout.NORTH);
        this.add(jPSouth, java.awt.BorderLayout.SOUTH);
        this.add(jPEast, java.awt.BorderLayout.EAST);
        this.add(jPWest, java.awt.BorderLayout.WEST);
        this.add(jPCenter, java.awt.BorderLayout.CENTER);

    }
}


