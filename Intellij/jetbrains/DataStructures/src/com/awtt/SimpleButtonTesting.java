package com.awtt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleButtonTesting {

    public static void main(String[] args) {

        Frame frame = new Frame("Social Buttons");

        frame.setSize(400, 250);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setLayout(new GridLayout(2, 1));

        Panel panel = new Panel();
        panel.setLayout(new FlowLayout());

        Button google = new Button("Google");
        Button facebook = new Button("Facebook");
        Button twitter = new Button("Twitter");
        Button linkedin = new Button("Linkeddin");

        panel.add(google);
        panel.add(facebook);
        panel.add(twitter);
        panel.add(linkedin);

        frame.add(panel);

        Label textLabel = new Label();
        textLabel.setAlignment(Label.CENTER);
        textLabel.setText("This is A Demo Text");
        frame.add(textLabel);

        google.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Google Button Pressed");
                textLabel.setText("Google Button Pressed");
                
            }
        });

        facebook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Facebook Button Pressed");
                textLabel.setText("Facebook Button Pressed");
            }
        });

        twitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Twitter Button Pressed");
                textLabel.setText("Twitter Button Pressed");
            }
        });

        linkedin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Linkedin Button Pressed");
                textLabel.setText("Linkedin Button Pressed");
            }
        });
    }
}
