package proj.testProj.animtest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class IncreaseSize extends JPanel implements ActionListener, KeyListener{


    Timer timer = new Timer(10, this);
    Random random;
    int x=20, y=20, velx=0, vely=0, step=1, width=20, height=20;
    int ballX , ballY ;

    public IncreaseSize(){
        random = new Random();
        timer.start();
        addKeyListener(this);
        setFocusTraversalKeysEnabled(false);
        setFocusable(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(x, y, width, height);

        g.setColor(Color.GREEN);
        g.fillOval(ballX, ballY, 20, 20);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {


        if (ballX == x && ballY == y){
            ballX = random.nextInt(500) + 40;
            ballY = random.nextInt(350) + 40;
            System.out.println("In condition");
            width += 20;
        }
        x += velx;
        y += vely;

        System.out.println(x + " " + y + " " + ballX + " " + ballY);

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
            vely = step;
        }


        if (c == KeyEvent.VK_A){
            velx = -step;
            vely = 0;
        }

        if (c == KeyEvent.VK_W){
            velx = 0;
            vely = -step;
        }

        if (c == KeyEvent.VK_D){
            velx = step;
            vely = 0;
        }


    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

        vely = 0;
        velx = 0;

    }

    public static void main(String[] args){
        IncreaseSize is = new IncreaseSize();

        JFrame jFrame = new JFrame("Increasing Object");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setSize(600, 400);
        jFrame.setVisible(true);
        jFrame.add(is);
    }
}










