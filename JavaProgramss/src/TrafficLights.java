import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLights extends Applet implements ItemListener {
    int colorNum;
    CheckboxGroup cbg;
    String msg = "";
    Checkbox red, yellow, green;

    public void init() {
        cbg = new CheckboxGroup();
        red = new Checkbox("Red", cbg, true);
        yellow = new Checkbox("Yellow", cbg, false);
        green = new Checkbox("Green", cbg, false);
        add(red);
        add(yellow);
        add(green);
        red.addItemListener(this);
        yellow.addItemListener(this);
        green.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == red) {
            colorNum = 1;
        } else if (e.getSource() == yellow) {
            colorNum = 2;
        } else {
            colorNum = 3;
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillOval(150, 70, 50, 40);
        g.fillOval(150, 120, 50, 40);
        g.fillOval(150, 170, 50, 40);

        switch (colorNum) {
            case 1:
                g.setColor(Color.RED);
                g.fillOval(150, 70, 50, 40);
                msg = "STOP";
                g.drawString(msg, 210, 100);
                break;
            case 2:
                g.setColor(Color.YELLOW);
                g.fillOval(150, 120, 50, 40);
                msg = "READY";
                g.drawString(msg, 210, 100);
                break;
            case 3:
                g.setColor(Color.GREEN);
                g.fillOval(150, 170, 50, 40);
                msg = "GO";
                g.drawString(msg, 210, 100);
                break;
        }
    }
    public static void main(String[] args){
        TrafficLights tf = new TrafficLights();
        JFrame f = new JFrame();
        f.add(tf);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf.init();
        tf.start();
    }
}
