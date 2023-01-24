import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class insert extends JFrame implements ActionListener {
    JButton btn;
    JLabel idLabel, nameLabel, rollLabel;
    JTextField idField, nameField, rollField;

    public insert() {
        setSize(400, 200);
        setLayout(new GridLayout(4, 2));

        idLabel = new JLabel("ID");
        idField = new JTextField();

        nameLabel = new JLabel("Name");
        nameField = new JTextField();

        rollLabel = new JLabel("Roll no.");
        rollField = new JTextField();
        btn = new JButton("Insert");
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

        // String url = "jdbc:sqlserver://localhost:1433;integratedSecurity=false;encrypt=false;trustServerCertificate=true;databaseName=studentdb;user=root;password=root";
        String url = "jdbc:sqlserver://localhost:1433;integratedSecurity=false;encrypt=false;trustServerCertificate=true;databaseName=studentdb;user=root;password=root";
        try (Connection conn = DriverManager.getConnection(url)) {
            String sql = "INSERT INTO students (ID, Name, Roll) VALUES ('" + id + "','" + name + "','" + roll + "')";
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


// CLASSPATH
// C:\Program Files\Microsoft JDBC DRIVER 11.2 for SQL Server\sqljdbc_11.2\enu\mssql-jdbc-11.2.3.jre11.jar

// run set classpath=%classpath%;.; every time when compiling the codes.

