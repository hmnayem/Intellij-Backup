package com.awtt;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class JPanelTesting {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Title");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = (JPanel) frame.getContentPane();
        panel.setLayout(new GridLayout(3, 1));

        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new FlowLayout());
        labelPanel.setBorder(new BevelBorder(BevelBorder.RAISED));

        JButton button1 = new JButton("Login");
        JButton button2 = new JButton("Logout");

        labelPanel.add(button1);
        labelPanel.add(button2);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(2, 1));
        textPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));

        JLabel text1 = new JLabel("Hello Shegufa");
        JLabel text2 = new JLabel("You Are Awesome");

        textPanel.add(text1);
        textPanel.add(text2);

        panel.add(labelPanel);
        panel.add(textPanel);

        frame.setVisible(true);
    }
}
