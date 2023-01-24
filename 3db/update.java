import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class update extends JFrame implements ActionListener {
    JButton btn;
    JLabel idLabel, nameLabel;
    JTextField idField, nameField;

    public update() {
        setSize(400, 200);
        setLayout(new GridLayout(3, 2));

        idLabel = new JLabel("ID");
        idField = new JTextField();

        nameLabel = new JLabel("Name");
        nameField = new JTextField();

        
        btn = new JButton("Update");
        btn.addActionListener(this);
        add(idLabel);
        add(idField);
        add(nameLabel);
        add(nameField);
       
        add(btn);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();

        String url = "jdbc:sqlserver://localhost:1433;integratedSecurity=false;encrypt=false;trustServerCertificate=true;databaseName=studentdb;user=root;password=root";
        try (Connection conn = DriverManager.getConnection(url)) {
            String sql = "UPDATE students SET Name = '" + name + "' WHERE ID = " + id;
			Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

        } catch (SQLException er) {
            er.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new update();
    }
}
