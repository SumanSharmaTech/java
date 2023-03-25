//create a GUI with text field label and button where the user click the button
//check if the string in the text field is palindrome or not and display the result with suitable message in label

import java.awt.*;
import java.awt.event.*;

public class palindrome extends Frame   {
    // implement windows listener for method 1
    // implement ActionListener for method 1
    Label lbl1, lbl2, lbl3, lbl4;
    TextField txt1, txt2, txt3;
    Button btn;

    public palindrome() {
        GridBagConstraints cons;
        cons = new GridBagConstraints();
        cons.insets = new Insets(5, 5, 5, 5);

        setSize(520, 300);
        setLayout(new GridBagLayout());

        lbl1 = new Label("Enter String:");
        lbl2 = new Label("Reversed");
        lbl3 = new Label("Result");

        txt1 = new TextField(20);
        txt2 = new TextField(20);
        btn = new Button("ok");

        cons.gridx = 0;
        cons.gridy = 0;
        add(lbl1, cons);
        cons.gridx = 1;
        cons.gridy = 0;
        add(txt1, cons);

        cons.gridx = 0;
        cons.gridy = 1;
        add(lbl2, cons);
        cons.gridx = 1;
        cons.gridy = 1;
        add(txt2, cons);

        cons.gridx = 0;
        cons.gridy = 2;
        cons.gridwidth = GridBagConstraints.REMAINDER;
        cons.fill = GridBagConstraints.HORIZONTAL;
        add(lbl3, cons);

        cons.gridx = 0;
        cons.gridy = 3;
        cons.gridwidth = GridBagConstraints.REMAINDER;
        cons.fill = GridBagConstraints.HORIZONTAL;
        add(btn, cons);
        btn.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    String str = txt1.getText();
                    String reversed = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        reversed += str.charAt(i);
                    }
                    txt2.setText(reversed);
            
                    if (reversed.equals(str)) {
                        lbl3.setText("PALINDROME.");
            
                    } else {
                        lbl3.setText(" NOT PALINDROME");
                    }
                    // txt3.setText(Double.toString(res));  
                    }
            }

        );
        addWindowListener( 
            new WindowAdapter(){
                public void windowClosing(WindowEvent e){   
                    // dispose();
                    System.exit(0);
                    //System.out.println("Close Pressed");
                }
            }
        );
        setVisible(true);
    }
        // old method for action method
        // public void actionPerformed(ActionEvent e) {
        // String str = txt1.getText();
        // String reversed = "";
        // for (int i = str.length() - 1; i >= 0; i--) {
        //     reversed += str.charAt(i);
        // }
        // txt2.setText(reversed);

        // if (reversed.equals(str)) {
        //     lbl3.setText("PALINDROME.");

        // } else {
        //     lbl3.setText(" NOT PALINDROME");
        // }
        // // txt3.setText(Double.toString(res));  
        // }
    // method 1
    // public void windowIconified(WindowEvent e){
    // }
    // public void windowActivated(WindowEvent e){
    // }
    // public void windowDeactivated(WindowEvent e){
    // }
    // public void windowClosed(WindowEvent e){   
    // }
    // public void windowOpened(WindowEvent e){
    // }
    // public void windowClosing(WindowEvent e){
    //     // dispose();
    //     System.out.println("Close Pressed");
    // }
    // public void windowlconified(WindowEvent e){
    // }
    // public void windowDeiconified(WindowEvent e){
    // }

    public static void main(String[] args) {
        new palindrome();
    }
}