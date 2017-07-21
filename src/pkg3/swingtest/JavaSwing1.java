package pkg3.swingtest;


import javax.swing.*;

public class JavaSwing1 extends JFrame{

    public static void main(String[] args){

        JFrame jFrame = new JFrame("Java Application");
        jFrame.setSize(400, 250);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("Hello, GOOD DAY");
        jFrame.add(jLabel);
    }
}
