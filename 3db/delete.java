import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class delete extends JFrame {
    private JLabel idLabel;
    private JTextField idTextField;
    private JButton deleteButton;

    public delete() {
        setTitle("Delete Record");
        setLayout(new FlowLayout());
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        idLabel = new JLabel("Enter ID:");
        idTextField = new JTextField(10);
        deleteButton = new JButton("Delete");

        add(idLabel);
        add(idTextField);
        add(deleteButton);

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(idTextField.getText());

                    Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=studentdb;integratedSecurity=true;");

                    String sql = "DELETE FROM student WHERE id = ?";
                    PreparedStatement stmt = conn.prepareStatement(sql);
                    stmt.setInt(1, id);
                    stmt.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Record deleted successfully!");

                    conn.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error deleting record: " + ex.getMessage());
                } finally {
                    idTextField.setText("");
                }
            }
        });
    }
    public static void main(String[] args) {
        new delete();
    }
}