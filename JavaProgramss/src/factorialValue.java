import java.applet.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class factorialValue extends Applet implements ActionListener{
    Button b1,b2;
    Label l1,l2;
    TextField tf1,tf2;
    public void init(){
        b1 = new Button("COMPUTE");
        b1.addActionListener(this);
        b2 = new Button("CLEAR");
        b2.addActionListener(this);
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        l1 = new Label("NUMBER");
        l2 = new Label("RESULT");
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);
        add(b2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            int a = Integer.parseInt(tf1.getText());
            int fact = 1;
            for(int i = 1 ; i <= a ; i++){
                fact *= i;
                tf2.setText(" "+fact);
            }
        }else{
            tf1.setText(" ");
            tf2.setText(" ");
        }
    }
    public static void main(String[] args){
        Frame f = new Frame("Factorial");
        factorialValue obj = new factorialValue();
        f.add(obj);
        f.setSize(400,400);
        f.setVisible(true);
        obj.init();
    }
}