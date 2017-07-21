package com.javaawt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleEventHandling {

    private Frame mainFrame;
    private Label headerLabel;
    private Label lowerLabel;
    private Panel buttonPanel;

    public SimpleEventHandling() {

        mainFrame = new Frame("My First GUI Project");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        lowerLabel = new Label();
        lowerLabel.setAlignment(Label.CENTER);
//        lowerLabel.setSize(350, 100);

        buttonPanel = new Panel();
        buttonPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(buttonPanel);
        mainFrame.add(lowerLabel);
        mainFrame.setVisible(true);

    }

    public void feature() {

        headerLabel.setText("Control in Action: Button");

        Button okButton = new Button("OK");
        Button submitButton = new Button("Submit");
        Button cancelButton = new Button("Cancel");

        buttonPanel.add(okButton);
        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("OK Pressed");
                lowerLabel.setText("OK Button Pressed");
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Submit Pressed");
                lowerLabel.setText("Submit Button Pressed");
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Cancel Pressed");
                lowerLabel.setText("Cancel Button Pressed");
            }
        });



        mainFrame.setVisible(true);
    }
}
