import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class SimpleCalculator extends Applet implements ActionListener {
    TextField tf;
    double ans = 0;
    String op = "=";
    boolean start = true;
    public void init() {
        setLayout(new BorderLayout());
        tf = new TextField("0");
        add(tf, BorderLayout.NORTH);

        Panel p = new Panel();
        p.setLayout(new GridLayout(4, 4));
        String buttons = "123+567*890*-/=";

        for (int i = 0; i < buttons.length(); i++) {
            Button b = new Button(buttons.substring(i, i + 1));
            p.add(b);
            b.addActionListener(this);
        }

        add(p);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if ('0' <= s.charAt(0) && s.charAt(0) <= '9' || s.equals(".")) {
            if (start) {
                tf.setText(s);
                start = false;
            } else {
                tf.setText(tf.getText() + s);
            }
        } else {
            if (!start) {
                calculate(Double.parseDouble(tf.getText()));
                op = s;
                start = true;
            }
        }
    }

    public void calculate(double n) {
        switch (op) {
            case "+":
                ans += n;
                break;
            case "-":
                ans -= n;
                break;
            case "*":
                ans *= n;
                break;
            case "/":
                try {
                    ans /= n;
                } catch (ArithmeticException e) {
                    tf.setText("Arithmetic Exception");
                }
                break;
            case "=":
                ans = n;
                break;
        }
        tf.setText(" " + ans);
    }

    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator();
        JFrame f = new JFrame("Calculate");
        f.add(sc);
        f.setVisible(true);
        f.setSize(400,400);
        sc.init();
        sc.start();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
