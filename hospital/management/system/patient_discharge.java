package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

class conn {
    Connection connection;
    Statement statement;
}

    public class patient_discharge extends JFrame {

        // Constructor
        patient_discharge() {

            JPanel panel = new JPanel();
            panel.setBounds(5, 5, 790, 390);
            panel.setBackground(new Color(90, 156, 163));
            panel.setLayout(null);
            add(panel);

            JLabel label = new JLabel("CHECK-OUT");
            label.setBounds(100, 20, 150, 20);
            label.setFont(new Font("Tahoma", Font.BOLD, 20));
            label.setForeground(Color.white);
            panel.add(label);

            JLabel label2 = new JLabel("Customer Id");
            label2.setBounds(30, 80, 150, 20);
            label2.setFont(new Font("Tahoma", Font.BOLD, 14));
            label2.setForeground(Color.white);
            panel.add(label2);

            Choice choice = new Choice();
            choice.setBounds(200, 80, 150, 25);
            panel.add(choice);

            try {
                connect c = new connect();
                ResultSet resultSet = c.statement.executeQuery("select * from Patient_Info");
                while (resultSet.next()) {
                    choice.add(resultSet.getString("number"));
                }
            }catch (Exception e) {
                e.printStackTrace();
            }



            JLabel label3 = new JLabel("Room Number");
            label3.setBounds(30, 130, 150, 20);
            label3.setFont(new Font("Tahoma", Font.BOLD, 14));
            label3.setForeground(Color.white);
            panel.add(label3);

            JLabel RNo = new JLabel();
            RNo.setBounds(200, 130, 150, 20);
            RNo.setFont(new Font("Tahoma", Font.BOLD, 14));
            RNo.setForeground(Color.white);
            panel.add(RNo);

            JLabel label4 = new JLabel("In Time");
            label4.setBounds(30, 180, 150, 20);
            label4.setFont(new Font("Tahoma", Font.BOLD, 14));
            label4.setForeground(Color.white);
            panel.add(label4);

            JLabel InTime = new JLabel();
            InTime.setBounds(200, 180, 250, 20);
            InTime.setFont(new Font("Tahoma", Font.BOLD, 14));
            InTime.setForeground(Color.white);
            panel.add(InTime);


            JLabel label5 = new JLabel("Out Time");
            label5.setBounds(30, 230, 150, 20);
            label5.setFont(new Font("Tahoma", Font.BOLD, 14));
            label5.setForeground(Color.white);
            panel.add(label5);

            Date date = new Date();

            JLabel OUTTime = new JLabel("" + date);
            OUTTime.setBounds(200, 230, 250, 20);
            OUTTime.setFont(new Font("Tahoma", Font.BOLD, 14));
            OUTTime.setForeground(Color.white);
            panel.add(OUTTime);


            setSize(800, 400);          // width = 800, height = 400
            setLayout(null);
            setLocation(400, 250);      // x = 400, y = 250
            setVisible(true);
        }

        // Main method
        public static void main(String[] args) {
            new patient_discharge();    // Create an instance to display the frame
        }
    }

