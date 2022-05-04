package za.ac.cput.userinterface;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.regex.*;

public class UserLogin implements ActionListener
{
    private JFrame mainFrame;

    private JPanel panelNorth, panelWest, panelEast, panelSouth;

    private JLabel lblHead;

    private JLabel lblUserName;
    private JTextField txtUserName;

    private JLabel lblPassword;
    private JTextField txtPassword;

    private JButton btnLogin;
    private JButton btnExit;

    public UserLogin()
    {
        mainFrame = new JFrame("User Login");
        panelNorth = new JPanel();
        panelWest = new JPanel();
        panelEast = new JPanel();
        panelSouth = new JPanel();

        lblHead = new JLabel("User Login:");

        lblUserName = new JLabel("User Name");
        txtUserName = new JTextField(10);

        lblPassword = new JLabel("Password");
        txtPassword = new JTextField(10);

        btnLogin = new JButton("Login");
        btnExit = new JButton("Exit");
    }

    //Method to set the GUI components onto a frame
    public void setGUI()
    {
        panelNorth.setLayout(new GridLayout(1, 1));
        panelWest.setLayout(new GridLayout(2, 1));
        panelEast.setLayout(new GridLayout(2, 1));
        panelSouth.setLayout(new GridLayout(1, 2));

        panelNorth.add(lblHead);

        panelEast.add(lblUserName);
        panelEast.add(txtUserName);

        panelEast.add(lblPassword);
        panelEast.add(txtPassword);

        panelSouth.add(btnLogin);
        panelSouth.add(btnExit);

        mainFrame.add(panelNorth, BorderLayout.NORTH);
        mainFrame.add(panelWest, BorderLayout.WEST);
        mainFrame.add(panelEast, BorderLayout.EAST);
        mainFrame.add(panelSouth, BorderLayout.SOUTH);

        btnLogin.addActionListener(this);
        btnExit.addActionListener(this);

        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

    //Checking if the password is valid
    public boolean passwordValidation(String password)
    {
        boolean flag = false;
        
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        Pattern passwordPattern = Pattern.compile(regex);
        Matcher matchedPassword = passwordPattern.matcher(password);
        matchedPassword.matches();

        if (password == null)
        {
             flag = false;
        }else
            if(matchedPassword.matches() == true)
            {
                flag = true;
            }

        return flag;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnLogin)
        {
            boolean pass;
            String password = txtPassword.getText();
            pass = passwordValidation(password);
            System.out.println("Password validation:" + pass);
        }

        if (e.getSource() == btnExit)
        {
            System.exit(0);
        }

    }

    public static void main(String[] args)
    {
        UserLogin loginGUI = new UserLogin();
        loginGUI.setGUI();
    }
}
