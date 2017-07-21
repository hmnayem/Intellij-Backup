package pkg1.junit.employee;


import javax.swing.*;

public class TestingGUI extends JFrame{

    public static void main(String[] args){

        final int frameWidth = 450;
        final int frameHeight = 300;
        JFrame frame = new JFrame("Hello Java");
        frame.setSize(frameWidth,frameHeight);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("Hello Java Swing");
        frame.add(jLabel);


    }
}
