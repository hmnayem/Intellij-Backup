package com.awtt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FirstGUITest {

    public static void main(String[] args) {

        Frame frame = new Frame("Twinkle Cat");
        frame.setSize(300, 300);
        frame.setBackground(Color.BLUE);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Software is Closing");
                System.exit(0);
            }

        });
    }
}
