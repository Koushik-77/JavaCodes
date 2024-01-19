import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class IntegerDivision extends Applet implements ActionListener {
    Label l1, l2, l3;
    TextField tf1, tf2, tf3;
    String msg;
    Button b1, b2;

    public void init() {
        b1 = new Button("COMPUTE");
        b1.addActionListener(this);
        b2 = new Button("CLEAR");
        b2.addActionListener(this);
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf3 = new TextField(20);
        l1 = new Label("NUMBER 1:");
        l2 = new Label("NUMBER 2:");
        l3 = new Label("RESULT");
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(b1);
        add(b2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                int a = Integer.parseInt(tf1.getText());
                int b = Integer.parseInt(tf2.getText());
                int c = a / b;
                tf3.setText(" " + c);
                repaint();
            } catch (NumberFormatException ex) {
                tf3.setText(" ");
                JOptionPane.showMessageDialog(this, "Enter only Numbers");
                repaint();
            } catch (ArithmeticException ex) {
                tf3.setText(" ");
                JOptionPane.showMessageDialog(this, "Enter non zero in number 2");
                repaint();
            }
        } else {
            tf1.setText(" ");
            tf2.setText(" ");
            tf3.setText(" ");
            msg = "Cleared";
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString(msg, 30, 70);
    }

    public static void main(String[] args) {
        IntegerDivision applet = new IntegerDivision();
        JFrame f = new JFrame("Integer Division");
        f.setSize(400,400);
        f.add(applet);
        applet.init();
        applet.start();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
