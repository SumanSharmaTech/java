import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class uservalidate extends JFrame implements ActionListener
{
    JButton btn_login;
    JLabel lbl_name,lbl_pass,lbl_display;
    JDialog dlg_new;
    JTextField txt_uname;
    JPasswordField txt_upass;
    public uservalidate(){
        super("Login Form");
        btn_login = new JButton("Login");
        lbl_name = new JLabel("Username");
        lbl_pass = new JLabel("Password");
        lbl_display = new JLabel("");
        txt_uname = new JTextField(20);
        txt_upass = new JPasswordField(20);
        setSize(400,200);
        setLayout(new  GridLayout(3,2));
        add(lbl_name);
        add(txt_uname);
        add(lbl_pass);
        add(txt_upass);
        add(btn_login);
        add(lbl_display);
        btn_login.addActionListener(this);

        setLocationRelativeTo(null);                
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String uname = txt_uname.getText();
        // String upass = txt_upass.getPassword().toString(); // This is wrong
        String upass = new String(txt_upass.getPassword());

        if(uname.equals("ram") && upass.equals("1111")){
            lbl_display.setText("Welcome, Ram.");
        }else{
            lbl_display.setText("Login Failed!");
        }
    }   
    public static void main(String[] args){
        new uservalidate();
    }
}