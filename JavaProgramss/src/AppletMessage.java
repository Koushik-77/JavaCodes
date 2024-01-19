import java.awt.*;
import java.applet.*;

class AppletMessageExample extends Frame {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        setBackground(Color.CYAN);
        g.drawString("Hi am applet", 7, 15);
    }
}
