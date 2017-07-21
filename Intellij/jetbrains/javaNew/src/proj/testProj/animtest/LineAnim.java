package proj.testProj.animtest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class LineAnim implements ActionListener{

    JFrame frame;
    Line line;
    Timer timer;

    int direction;
    public LineAnim(){
        frame = new JFrame("LINE MOVE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(300, 300);
        frame.setVisible(true);

        line = new Line();

        frame.add(line);
        timer = new Timer(20, this);

        timer.start();
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        while (true){

            Scanner scanner = new Scanner(System.in);
            while (true){
                line.move(scanner.nextInt());
                line.repaint();
            }
        }

    }



    public static void main(String[] args){
        new LineAnim();
    }
}


class Line extends JPanel{

    private final int STEP = 10;
    private final int UP = 1, DOWN = 2, LEFT = 3, RIGHT = 4;

    private int x = 10, y = 10;
    Line line;


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        g.setColor(Color.BLACK);
        g.fillRect(x, y, 10, 10);
    }

    public void move(int direction){

        if (direction == UP && y>10){
            y = y-STEP;
        }
        if (direction == DOWN && y<this.getHeight()-10){
            y = y+STEP;
        }
        if (direction == LEFT && x>10){
            x = x-STEP;
        }
        if (direction == RIGHT && x<this.getHeight()-10){
            x = x+STEP;
        }

    }
}