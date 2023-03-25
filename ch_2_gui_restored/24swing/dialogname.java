import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class dialogname extends JFrame implements ActionListener
{
    JButton btn_show;
    JLabel lbl_name,lbl_display;
    JDialog dlg_new;
    JTextField txt_data;
    public dialogname(){

        btn_show = new JButton("ok");
        lbl_name = new JLabel("Enter your name !");
        txt_data = new JTextField();

        setSize(400,200);
        setLayout(new  GridLayout(2,2));
        
        add(lbl_name);
        add(txt_data);
        add(btn_show);
        btn_show.addActionListener(this);

    setLocationRelativeTo(null);                
    setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
       
            if(e.getSource()==btn_show){
            dlg_new = new JDialog(dlg_new,"test",true);
            dlg_new.setSize(200,100);
            dlg_new.setLocationRelativeTo(this);
            dlg_new.setLayout(new FlowLayout());
            lbl_display = new JLabel();
            lbl_display.setText(txt_data.getText());
            dlg_new.add(lbl_display);
            dlg_new.setVisible(true);
            }
        
    }   
    public static void main(String[] args){
        new dialogname();
    }
}