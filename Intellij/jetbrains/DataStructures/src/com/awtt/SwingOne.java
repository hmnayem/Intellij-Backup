package com.awtt;

import javax.swing.*;
import java.awt.*;

public class SwingOne {

    private static int count = 1;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello Swing");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        Dimension dimension = frame.getToolkit().getScreenSize();
        frame.setLocation(dimension.width / 2 - frame.getWidth() / 2, dimension.height / 2 - frame.getHeight() / 2);

        frame.setVisible(true);
    }
}
