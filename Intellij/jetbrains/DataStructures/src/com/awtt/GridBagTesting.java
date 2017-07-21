package com.awtt;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GridBagTesting {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello GridBagConstraints");
        frame.setSize(450, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel framePanel = (JPanel) frame.getContentPane();

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridBagLayout());
        contentPanel.setBorder(new EmptyBorder(new Insets(10, 10, 10, 10)));

        framePanel.add(BorderLayout.CENTER, contentPanel);

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridx = 0;
        constraints.gridy = 0;

        JLabel nameLabel = new JLabel("NAME: ");
        nameLabel.setBorder(new EmptyBorder(new Insets(0, 20, 0, 10)));
        contentPanel.add(nameLabel, constraints);


        JTextField nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(200, 40));
        constraints.gridx = 1;
        constraints.weightx = 1.0;
        constraints.gridwidth = 2;
        contentPanel.add(nameField, constraints);

        JLabel emailLabel = new JLabel("Email: ");
        emailLabel.setBorder(new EmptyBorder(new Insets(0, 20, 0, 10)));
        constraints.gridx = 0;
        constraints.gridy = 1;
        contentPanel.add(emailLabel, constraints);

        JTextField emailField = new JTextField();
        emailField.setPreferredSize(new Dimension(200, 40));
        constraints.gridx = 1;
        constraints.weightx = 1.0;
        constraints.gridwidth = 2;
        contentPanel.add(emailField, constraints);

        frame.setVisible(true);
    }
}
