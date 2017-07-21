package proj.testProj;

import javax.swing.*;
import java.awt.*;

//@SuppressWarnings("Serial")
public class RendarPanel extends JPanel {

    static int cols;
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(444451));
        g.fillRect(0, 0, 800, 800);

        GraphicsTest snake = new GraphicsTest();


    }
}
