package proj.testProj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Timer;


public class GraphicsTest implements ActionListener{

    public static GraphicsTest snake;
    public JFrame jFrame;
    public Toolkit toolkit;
    public RendarPanel rendarPanel;
    public Timer timer;
    public Random random;

    public ArrayList<Point> points = new ArrayList<>();
    public final int UP = 0, LEFT = 2, RIGHT = 3, DOWN = 1, SCALE = 10;
    public int ticks = 0, direction = DOWN, score=0;
    public Point head, chery;

    Dimension dimension;

    public boolean over = false;


    public GraphicsTest() {

        dimension = Toolkit.getDefaultToolkit().getScreenSize();
        rendarPanel = new RendarPanel();
        timer = new Timer(20, this);
        jFrame = new JFrame("JAVA Swing");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setSize(800, 800);
        jFrame.setLocation(dimension.width/2-jFrame.getWidth(), dimension.height/2-jFrame.getHeight());
        jFrame.add(rendarPanel);

        random = new Random();
        head = new Point(0, 0);
        chery = new Point(dimension.width/SCALE, dimension.height/SCALE);

        timer.start();
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        rendarPanel.repaint();
        ticks++;

        if(ticks%10 == 0 && head!=null && !over){

            if (direction == UP) {

                if (head.y - 1 >0) {
                    points.add(new Point(head.x, head.y-1));
                }
                else {
                    over = true;
                }
            }
            if (direction == DOWN) {
                if (head.y + 1 < dimension.height / SCALE) {
                    points.add(new Point(head.x, head.y + 1));
                } else {
                    over = true;
                }
            }
            if (direction == LEFT) {
                if (head.x - 1 > 0) {
                    points.add(new Point(head.x - 1, head.y));
                } else {
                    over = true;
                }
            }
            if (direction == RIGHT) {
                if (head.x + 1 < dimension.width / SCALE) {
                    points.add(new Point(head.x + 1, head.y));
                } else {
                    over = true;
                }
            }

            points.remove(0);
            if (chery != null) {
                if (head.equals(chery)){
                    score++;
                    chery.setLocation(dimension.width/SCALE, dimension.height/SCALE);
                }
            }
        }
    }

    public static void main(String[] args) {

        snake = new GraphicsTest();

    }
}















