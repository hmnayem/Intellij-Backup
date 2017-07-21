package proj.testProj.animtest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MovingBox extends JPanel implements ActionListener, KeyListener{

    Timer timer = new Timer(5, this);
    int x = 0, y = 0, velx = 0, vely = 0;

    public MovingBox(){
        timer.start();

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 50, 50);

    }

    public void actionPerformed(ActionEvent e){

        if (x < 0) {
            velx = 0;
            x = 0;
        }

        if (y < 0) {
            vely = 0;
            y = 0;
        }

        if (x > this.getWidth()-50) {
            velx = 0;
            x = this.getWidth()-50;
        }

        if (y > this.getHeight()-50) {
            vely = 0;
            y = this.getHeight()-50;
        }



        x = x+velx;
        y = y+vely;
        repaint();
    }


    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int c = keyEvent.getKeyCode();

        if (c == keyEvent.VK_S){
            velx = 0;
            vely = 1;
        }


        if (c == KeyEvent.VK_A){
            velx = -1;
            vely = 0;
        }

        if (c == KeyEvent.VK_W){
            velx = 0;
            vely = -1;
        }

        if (c == KeyEvent.VK_D){
            velx = 1;
            vely = 0;
        }


    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    public static void main(String[] args){
        MovingBox m = new MovingBox();
        JFrame frame = new JFrame("Moving Box");
        frame.setSize(600, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(m);
    }
}
