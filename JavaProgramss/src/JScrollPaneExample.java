import javax.swing.*;
import java.awt.*;
public class JScrollPaneExample {
    JFrame f;
    JScrollPaneExample() {
        f = new JFrame();
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(20, 20));
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                jp.add(new JButton("Button" + (i * 20 + j)));
            }
        }
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane js = new JScrollPane(jp, v, h);
        f.add(js, BorderLayout.CENTER);
        f.setSize(300, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JScrollPaneExample();
    }
}