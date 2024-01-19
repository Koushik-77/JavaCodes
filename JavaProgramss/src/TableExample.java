import javax.swing.*;

public class TableExample {
    TableExample(){
        JFrame f = new JFrame();
        String data[][] = {
                {"501","Ravi","500"},
                {"502","Raju","100"},
                {"503","Ramu","70"},
        };
        String column[] = {"ID","NAME","SALARY"};
        JTable jt = new JTable(data,column);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new TableExample();
    }
}
