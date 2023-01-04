import java.awt.*;
import java.awt.event.*;
class sum extends Frame implements ActionListener
{
    Button add,sub;
    Label l1, l2, lres;
    TextField t1, t2, tres;
    public sum(){
        add = new Button("add");
        sub = new Button("sub");

        l1 = new Label("First Number");
        l2 = new Label("Second Number");
        lres = new Label("sum");
        t1 = new TextField(50);
        t2 = new TextField(50);
        tres = new TextField(50);


        setSize(600, 400);
        setLayout( new GridLayout(4,2));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(lres);
        add(tres);
        add(add);
        add.addActionListener(this);
        // add(sub);
        // sub.addActionListener(this);
        setVisible(true);
    }
    public static void main(String[] args){
        new sum();
    }
    public void actionPerformed(ActionEvent e){
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        double addres = a + b;
        // double c = Double.parseDouble(t1.getText());
        // double d = Double.parseDouble(t2.getText());
        // double sumres = a - b;
        tres.setText(Double.toString(addres));
        // tres.setText(Double.toString(sumres));

    }
}