package com.awtt;

import javax.swing.*;

public class SpringLayoutTesting {

    public static void main(String[] args) {

        String[] labels = {"Name: ", "Email: ", "Phone: ", "Address: "};

        JFrame frame = new JFrame("Spring Layout");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = (JPanel) frame.getContentPane();

        panel.setLayout(new SpringLayout());

        for (int i=0; i<labels.length; i++) {

            JLabel label = new JLabel(labels[i]);
            JTextField textField = new JTextField();
            label.setLabelFor(textField);

            panel.add(label);

        }

        frame.setVisible(true);

    }
}
