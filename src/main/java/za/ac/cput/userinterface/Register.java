package za.ac.cput.userinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame {
    private JTextField LNtxt;
    private JTextField FNtxt;
    private JTextField Emailtxt;
    private JTextField Celltxt;
    private JButton registerButton;
    private JButton clearButton;
    private JTextField Usertxt;
    private JTextField Passwordtxt;
    private JLabel Register;
    private JPanel registerPanel;

    public Register(JFrame parent){
        setTitle("Create an Account");
        setContentPane(registerPanel);
        setMinimumSize(new Dimension(450,474));
        setLocationRelativeTo(parent);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FNtxt.setText("");
                LNtxt.setText("");
                Emailtxt.setText("");
                Celltxt.setText("");
                Usertxt.setText("");
                Passwordtxt.setText("");


            }
        });
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });

        setVisible(true);
    }

    private void registerUser() {
        String FirstName = FNtxt.getText();
        String LastName = LNtxt.getText();
        String Email = Emailtxt.getText();
        String CellNumber = Celltxt.getText();
        String UserName= Usertxt.getText();
        String Password = Passwordtxt.getText();

        if (FirstName.isEmpty() || LastName.isEmpty() || Email.isEmpty()|| CellNumber.isEmpty() || UserName.isEmpty() || Password.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter all fields",
                    "Try again", JOptionPane.ERROR_MESSAGE);
            return;
        }
      user =  addUsertoDatabase(FirstName,LastName,Email,CellNumber,UserName,Password);
        if (user != null){
            dispose();
        }
        else {
            JOptionPane.showMessageDialog(this,
                    "Failed to register new user",
                    "Try again", JOptionPane.ERROR_MESSAGE);
        }
    }

    public User user;
    private User addUsertoDatabase(String FirstName, String LastName, String Email, String CellNumber, String UserName, String Password ){
        User user = null;
        return user;
    }

    public static void main(String[] args){
        Register myForm = new Register(null);
    }
}
