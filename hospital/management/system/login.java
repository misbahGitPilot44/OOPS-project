package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {

    JTextField textField;
    JPasswordField jPasswordField;
    JButton b1,b2;
    login(){

        JLabel namelabel = new JLabel("UserName");
        namelabel.setBounds(40,20, 100, 30 );
        namelabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        namelabel.setForeground(Color.black);
        add(namelabel);

        JLabel password = new JLabel("Password");
        password.setBounds(40,70, 100, 30 );
        password.setFont(new Font("Tahoma", Font.BOLD, 16));
        password.setForeground(Color.black);
        add(password);

        textField = new JTextField();
        textField.setBounds(150, 20, 150, 30);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField.setBackground(new Color(255, 179, 0));
        add(textField);

        jPasswordField = new JPasswordField();
        jPasswordField.setBounds(150, 70, 150, 30);
        jPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jPasswordField.setBackground(new Color(255, 179, 0));
        add(jPasswordField);

        // Image //

        b1 = new JButton("Login");
        b1.setBounds(40, 140, 120, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180, 140, 120, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.addActionListener(this);
        add(b2);



        getContentPane().setBackground(new Color(109, 164, 170));
        setSize(750, 300);
        setLayout(null);
        setLocation(400, 270);
        setVisible(true);

    }
    public static void main(String[] args) {
        new login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        

    }
}
