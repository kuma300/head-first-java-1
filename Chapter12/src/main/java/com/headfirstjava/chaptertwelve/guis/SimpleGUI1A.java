package com.headfirstjava.chaptertwelve.guis;

import javax.swing.*;

public class SimpleGUI1A {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("Click Me!");

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(jButton);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
    }
}
