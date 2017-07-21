package pkg3.swingtest;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloNameClone extends JFrame implements ActionListener{

    JLabel question = new JLabel("What is Your name?");
    Font fonts = new Font("Arial", Font.BOLD, 16);
    JTextField textField = new JTextField(20);
    JButton button = new JButton("Submit");
    JLabel label = new JLabel("");

    public HelloNameClone(){
        super("JAVA GUI Testing");
        setSize(250, 225);
        setLayout(new FlowLayout());
        question.setFont(fonts);
        label.setFont(fonts);
        getContentPane().setBackground(Color.red);
        add(question);
        add(textField);
        add(button);
        add(label);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String name = textField.getText();
        String gret = "Hello, " + name;
        label.setText(gret);
    }

    public static void main(String[] args){
        HelloNameClone hnc = new HelloNameClone();
        hnc.setVisible(true);
    }

}
