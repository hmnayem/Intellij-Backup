package proj.testProj.animtest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class StringAnimation1 implements ActionListener{

    public JFrame jFrame;
    private StringRender strRen;
    private Timer timer;

    public StringAnimation1(){
        jFrame = new JFrame("TWINKLE CAT");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setSize(300, 300);
        strRen = new StringRender();
        jFrame.add(strRen);
        jFrame.setVisible(true);
        timer = new Timer(20, this);

        timer.start();

    }
    public static void main(String[] args){
        new StringAnimation1();
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        strRen.repaint();
    }
}


class StringRender extends JPanel{

    Font font = new Font("TimesRoman", Font.BOLD, 36);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(16777215).darker());
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        g.setColor(new Color(0));
        g.fillRect(10, 10, this.getWidth()-20, this.getHeight()-20);

        g.setColor(new Color(16777215).darker());
        g.fillRect(25, 80, 250, 100);




        String times = String.format("%2s:%2s:%2s", LocalTime.now().getHour()>12?LocalTime.now().getHour()-12 :LocalTime.now().getHour(),
                (LocalTime.now().getMinute() < 10 ? ("0" + LocalTime.now().getMinute()) : LocalTime.now().getMinute()),
                (LocalTime.now().getSecond() < 10 ? ("0" + LocalTime.now().getSecond()) : LocalTime.now().getSecond()));

        g.setColor(new Color(0).darker());
        g.setFont(font);
        g.drawString(times, 55, 145);

        g.setColor(new Color(16777215).darker());
        g.drawString("TIMES", 80, 50);

    }
}
