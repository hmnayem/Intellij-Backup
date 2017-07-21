package proj.testProj.animtest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LOLAnim implements ActionListener{

    JFrame jFrame;
    DrawPanel drawPanel;
    Timer timer;

    private int oneX = 7;
    private int oneY = 7;

    private boolean up = false, down = true, left = false, right = true;

    public static void main(String[] args) {
        new LOLAnim().go();
    }

    private void go()  {

        jFrame = new JFrame("Testing Animation");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        drawPanel = new DrawPanel();
        jFrame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        jFrame.setSize(300, 300);
        jFrame.setLocationByPlatform(true);
        jFrame.setVisible(true);
        timer = new Timer(1000, this);
        moveIt();

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }


    class DrawPanel extends JPanel{

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.BLUE);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(Color.RED);
            g.fillRect(3, 3, this.getWidth()-6, this.getHeight()-6);
            g.setColor(new Color(444451));
            g.fillRect(6, 6, this.getWidth()-12, this.getHeight()-12);
            g.setColor(Color.RED);
            g.fillOval(oneX, oneY, 20, 20);
        }
    }

    private void moveIt() {

        while (true) {

            if (oneX >= 283) {
                right = false;
                left = true;
            }
            if (oneX <= 7) {
                right = true;
                left = false;
            }
            if (oneY >= 259) {
                up = true;
                down = false;
            }
            if (oneY <= 7) {
                up = false;
                down = true;
            }

            if (up) oneY--;
            if (down) oneY++;
            if (left) oneX--;
            if (right) oneX++;
            timer.start();
            jFrame.repaint();
        }
    }

}













