package pkg3.swingtest;

import javax.swing.*;
import java.awt.*;

public class BasicFrame extends JFrame{

    public static void main(String[] args){

        JFrame jFrame = new JFrame("Hello JFrame");
        jFrame.setSize(300, 250);
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        JLabel question = new JLabel("What is your name?");
        jFrame.add(question);
        JLabel ans = new JLabel("My Name is : HM Nayem");
        jFrame.add(ans);


    }
}
