import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class insert extends JFrame {
    private JLabel lblId, lblName, lblRoll;
    private JTextField txtId, txtName, txtRoll;
    private JButton btnInsert;

    public insert() {
        setLayout(new GridLayout(4,2));
        setTitle("Student Record Insertion");

        lblId = new JLabel("ID:");
        add(lblId);
        txtId = new JTextField(10);
        add(txtId);

        lblName = new JLabel("Name:");
        add(lblName);
        txtName = new JTextField(20);
        add(txtName);

        lblRoll = new JLabel("Roll:");
        add(lblRoll);
        txtRoll = new JTextField(10);
        add(txtRoll);

        btnInsert = new JButton("Insert");
        add(btnInsert);

        btnInsert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    } catch (ClassNotFoundException e1) {
                        System.out.println("Error: Unable to load the driver class.");
                        e1.printStackTrace();
                    }                    
                    // String url = "jdbc:sqlserver://CRAXER:1433;databaseName=studentdb;user=root;password=root"; // 3306 & 1433
                    String url = "jdbc:sqlserver://CRAXER:1433;databaseName=studentdb;integratedSecurity=true;";
                    Connection con = DriverManager.getConnection(url);
                    String sql = "INSERT INTO Student (id, name, roll) VALUES (?, ?, ?)";
                    PreparedStatement stmt = con.prepareStatement(sql);
                    stmt.setString(1, txtId.getText());
                    stmt.setString(2, txtName.getText());
                    stmt.setString(3, txtRoll.getText());
                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record inserted successfully!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                }
            }
        });

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new insert();
    }
}
