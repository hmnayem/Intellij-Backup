package com.awtt;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CustomBorder implements Border {

    protected int m_w;
    protected int m_h;

    protected Color mTopColor = Color.BLUE;
    protected Color mBottomColor = Color.GREEN;

    public CustomBorder() {
        m_w = 6;
        m_h = 6;
    }

    public CustomBorder(int m_w, int m_h) {
        this.m_w = m_w;
        this.m_h = m_h;
    }

    public CustomBorder(int m_w, int m_h, Color mTopColor, Color mBottomColor) {
        this.m_w = m_w;
        this.m_h = m_h;
        this.mTopColor = mTopColor;
        this.mBottomColor = mBottomColor;
    }

    public Insets getBorderInsets(Component component) {
        return new Insets(m_h, m_w, m_h, m_w);
    }

    public boolean isBorderOpaque() {
        return true;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int w, int h) {
        w--;
        h--;

        g.setColor(mTopColor);
        g.drawLine(x, y + h - m_h, x, y + m_h);
        g.drawArc(x, y, 2 * m_w, 2 * m_h, 180, -90);
        g.drawLine(x + m_w, y, x + w - m_w, y);
        g.drawArc(x + w - 2 * m_w, y, 2 * m_w, 2 * m_h, 90, -90);

        g.setColor(mBottomColor);
        g.drawLine(x + w, y + m_h, x + w, y + h - m_h);
        g.drawArc(x + w - 2 * m_w, y + h - 2 * m_h, 2 * m_w, 2 * m_h, 0, -90);
        g.drawLine(x + m_w, y + h, x + w - m_w, y + h);
        g.drawArc(x, y + h - 2 * m_h, 2 * m_w, 2 * m_h, -90, -90);



    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Border");
        JLabel label = new JLabel("Oval Border");
        ((JPanel) frame.getContentPane()).setBorder(new CompoundBorder(new EmptyBorder(10, 10, 10, 10), new CustomBorder(10, 10)));
        frame.getContentPane().add(label);
        frame.setBounds(0, 0, 300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
















