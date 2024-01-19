import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyListenerExample extends Frame implements KeyListener {
    Label l;
    TextArea area;

    KeyListenerExample() {
        l = new Label();
        l.setBounds(20, 50, 100, 20);
        area = new TextArea();
        area.setBounds(20, 80, 300, 300);
        area.addKeyListener(this); // Removed unnecessary casting
        add(l);
        add(area);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        l.setText("Key Released");
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
