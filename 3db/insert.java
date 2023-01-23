import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class insert extends JFrame implements ActionListener {
    JButton btn;
    JLabel idLabel, nameLabel, rollLabel;
    JTextField idField, nameField, rollField;

    public insert() {
        setSize(400, 400);
        setLayout(new GridLayout(4, 2));

        idLabel = new JLabel("ID:");
        idField = new JTextField();

        nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        rollLabel = new JLabel("Roll:");
        rollField = new JTextField();
        btn = new JButton("save");
        btn.addActionListener(this);
        add(idLabel);
        add(idField);
        add(nameLabel);
        add(nameField);
        add(rollLabel);
        add(rollField);
        add(btn);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        int roll = Integer.parseInt(rollField.getText());

        String url = "jdbc:sqlserver://localhost:1433;integratedSecurity=false;encrypt=false;trustServerCertificate=true;databaseName=demoDB;user=root;password=root";
        try (Connection conn = DriverManager.getConnection(url)) {
            String sql = "INSERT INTO Student (ID, Name, Roll) VALUES ('" + id + "','" + name + "','" + roll + "')";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

        } catch (SQLException er) {
            er.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new insert();
    }
}
