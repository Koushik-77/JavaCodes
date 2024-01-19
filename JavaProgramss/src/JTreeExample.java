import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class JTreeExample {
    JFrame f;
    JTreeExample(){
        f = new JFrame();
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode Color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
        style.add(Color);
        style.add(font);
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("blue");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
        Color.add(red);
        Color.add(blue);
        Color.add(green);
        JTree jt = new JTree(style);
        f.add(jt);
        f.setSize(250,250);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTreeExample();
    }
}
