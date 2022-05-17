package za.ac.cput.userinterface;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.regex.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class UserLogin implements ActionListener
{
    private final JFrame mainFrame;

    private final JPanel panelNorth;
    private final JPanel panelWest;
    private final JPanel panelEast;
    private final JPanel panelSouth;

    private final JLabel lblHead;

    private final JLabel lblUserName;
    private final JTextField txtUserName;

    private final JLabel lblPassword;
    private final JPasswordField pswdPassword;

    private final JButton btnLogin;
    private final JButton btnExit;

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
        pswdPassword = new JPasswordField(10);

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
        panelEast.add(pswdPassword);

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
    public void passwordMessageToUser(boolean pass)
    {
        if(pass == false)
        {
            showMessageDialog(null, "The password needs to be 8 characters or longer, have a"
                    + " Uppercase(A-Z), lowercase(a-z), numbers(1-9) and special characters(!, #, $)");
        }

        if(pass == true)
        {
            showMessageDialog(null, "The password is correct");
        }
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnLogin)
        {
            boolean pass;
            String password = String.valueOf(pswdPassword.getPassword());
            pass = passwordValidation(password);

            passwordMessageToUser(pass);
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
