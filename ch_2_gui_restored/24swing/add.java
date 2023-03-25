import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class add extends JFrame
{
    JButton btn_res;
    JLabel lbl_res, lbl_fn, lbl_sn;
    JTextField txt_t1, txt_t2, txt_res;
    public add(){
        btn_res = new JButton("add");
        // sub = new JButton("sub");

        lbl_fn = new JLabel("First Number");
        lbl_sn = new JLabel("Second Number");
        lbl_res = new JLabel("sum");
        txt_t1 = new JTextField(50);
        txt_t2 = new JTextField(50);
        txt_res = new JTextField(50);


        setSize(600, 400);
        setLayout( new GridLayout(4,2));
        add(lbl_fn);
        add(txt_t1);
        add(lbl_sn);
        add(txt_t2);
        add(lbl_res);
        add(txt_res);
        add(btn_res);
        // btn_res.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent e) {
        //         double a = Double.parseDouble(txt_t1.getText());
        //         double b = Double.parseDouble(txt_t2.getText());
        //         btn_res.setText(Double.toString(a+b));
        //     }   
        // });
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        btn_res.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(txt_t1.getText());
                double b = Double.parseDouble(txt_t2.getText());
                txt_res.setText(Double.toString(a+b));
            }   
        });

        addWindowListener(new WindowAdapter(){
                 public void windowClosing(WindowEvent e){
                int a=JOptionPane.showConfirmDialog(null,"Are you sure to exit ?");
            
            // JOptionPane j=new JOptionPane();
            // int btn=j.showConfirmDialog(null,"Are you sure to exit");
           
            if(a==0)
            {
            System.exit(0); 
            }
        }
    });                 
        // add(sub);
        // sub.addActionListener(this);
        setVisible(true);

    }
    public static void main(String[] args){
        new add();
    }
}