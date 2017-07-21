package pkg3.swingtest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloName extends JFrame implements ActionListener{

    JLabel question = new JLabel("What is Your Name?");
    Font bigFont = new Font("Arial", Font.BOLD, 16);
    JTextField answer = new JTextField(15);
    JButton press = new JButton("Press Me");
    JLabel greeting = new JLabel("");

    final int width = 225;
    final int height = 225;

    public HelloName(){
        super("Hello Name Apps");
        setSize(width, height);
        setLayout(new FlowLayout());
        question.setFont(bigFont);
        greeting.setFont(bigFont);
        add(question);
        add(answer);
        add(press);
        add(greeting);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        press.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String name = answer.getText();
        String greet = "Hello, " + name;
        greeting.setText(greet);
    }

    public static void main(String[] args){

        HelloName hn = new HelloName();
        hn.setVisible(true);

    }
}
