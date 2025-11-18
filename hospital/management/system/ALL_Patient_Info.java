package hospital.management.system;

import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class ALL_Patient_Info {

    ALL_Patient_Info() {
        JFrame frame = new JFrame("All Patient Info");

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 890, 590);
        panel.setBackground(new Color(90, 156, 163));
        panel.setLayout(null);

        JTable table = new JTable();
        table.setBounds(10, 40, 860, 450);
        table.setBackground(new Color(90, 156, 163));

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 40, 860, 450);
        panel.add(scrollPane);

        try {
            connect c = new connect();
            String q = "SELECT * FROM Patient_Info";
            ResultSet resultSet = c.statement.executeQuery(q);

            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();
        }

        frame.add(panel);
        frame.setSize(900, 600);
        frame.setLayout(null);
        frame.setLocation(300, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ALL_Patient_Info();
    }
}
