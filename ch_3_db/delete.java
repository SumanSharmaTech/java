import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class delete extends JFrame implements ActionListener {
    JButton btn;
    JLabel idLabel, nameLabel, rollLabel;
    JTextField idField, nameField, rollField;

    public delete() {
        setSize(400, 200);
        setLayout(new GridLayout(2, 2));

        idLabel = new JLabel("ID");
        idField = new JTextField();

        btn = new JButton("Delete");
        btn.addActionListener(this);
        add(idLabel);
        add(idField);
        add(btn);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int id = Integer.parseInt(idField.getText());
        

        String url = "jdbc:sqlserver://localhost:1433;integratedSecurity=false;encrypt=false;trustServerCertificate=true;databaseName=studentdb;user=root;password=root";
        try (Connection conn = DriverManager.getConnection(url)) {
            String sql = "DELETE FROM students WHERE ID = " + id;
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

        } catch (SQLException er) {
            er.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new delete();
    }
}
