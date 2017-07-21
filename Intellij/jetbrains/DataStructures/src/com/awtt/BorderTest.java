package com.awtt;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class BorderTest {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Border Test");
        frame.setSize(455, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel content = (JPanel) frame.getContentPane();
        content.setLayout(new GridLayout(4, 2, 5, 5));

        JPanel p = new JPanel();
        p.setBorder(new BevelBorder(BevelBorder.RAISED));
        p.add(new JLabel("Raised BevelBorder"));
        content.add(p);

        p = new JPanel();
        p.setBorder(new BevelBorder(BevelBorder.LOWERED));
        p.add(new JLabel("Lowered BevelBorder"));
        content.add(p);

        p = new JPanel();
        p.setBorder(new LineBorder(Color.BLACK, 4, true));
        p.add(new JLabel("Line Border thickness = 4"));
        content.add(p);

        p = new JPanel();
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(new JLabel("Empty Border"));
        content.add(p);

        p = new JPanel();
        p.setBorder(new EtchedBorder(EtchedBorder.RAISED));
        p.add(new JLabel("Etched Border Raised"));
        content.add(p);

        p = new JPanel();
        p.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        p.add(new JLabel("Etched Border Lowered"));
        content.add(p);

        p = new JPanel();
        p.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        p.add(new JLabel("Soft Bevel Border Raised"));
        content.add(p);

        p = new JPanel();
        p.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
        p.add(new JLabel("Soft Bevel Border Lowered"));
        content.add(p);



        frame.setVisible(true);
    }
}
