import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseEventApplet extends Applet implements MouseListener, MouseMotionListener {
    String msg = "";
    int mouseX = 0, mouseY = 0;

    @Override
    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Mouse Clicked";
        repaint();
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Mouse Pressed";
        repaint();
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Mouse Released";
        repaint();
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Mouse Entered";
        showStatus("Mouse entered at " + mouseX + ", " + mouseY);
        repaint();
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Mouse Exited";
        showStatus("Mouse exited at " + mouseX + ", " + mouseY);
        repaint();
    }

    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Mouse Dragged";
        showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
        repaint();
    }

    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
        showStatus("Moving mouse at " + e.getX() + ", " + e.getY());
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }

    public static void main(String[] args) {
        Frame f = new Frame("MouseEventApplet");
        MouseEventApplet applet = new MouseEventApplet();
        f.add(applet);
        f.setSize(400, 400);
        f.setVisible(true);
        applet.init();
    }
}
