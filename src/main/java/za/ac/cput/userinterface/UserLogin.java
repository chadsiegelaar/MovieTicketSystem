package za.ac.cput.userinterface;

import za.ac.cput.domain.User;
import za.ac.cput.factory.UserFactory;

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

    //Set colors of the login screen
    public void setColors()
    {
        panelNorth.setBackground(Color.decode("#F2E71D"));
        panelWest.setBackground(Color.decode("#F2E71D"));
        panelEast.setBackground(Color.decode("#F2E71D"));
        panelSouth.setBackground(Color.decode("#F2E71D"));

        btnLogin.setBackground(Color.decode("#000000"));
        btnLogin.setForeground(Color.decode("#F2E71D"));

        btnExit.setBackground(Color.decode("#000000"));
        btnExit.setForeground(Color.decode("#F2E71D"));

        //Login Pop up colors
        UIManager UI=new UIManager();
        UI.put("OptionPane.background", Color.decode("#F2E71D"));
        UI.put("OptionPane.messageForeground", Color.decode("#000000"));
        UI.put("Panel.background", Color.decode("#F2E71D"));
        UI.put("Button.background", Color.decode("#000000"));
        UI.put("Button.foreground", Color.decode("#F2E71D"));
    }

    //Method to set the GUI components onto a frame
    public void setGUI()
    {
        panelNorth.setLayout(new GridLayout(1, 1));
        panelWest.setLayout(new GridLayout(2, 1));
        panelEast.setLayout(new GridLayout(2, 1));
        panelSouth.setLayout(new GridLayout(1, 2));

        panelNorth.add(lblHead);


        lblUserName.setPreferredSize(new Dimension(193, 20));
        txtUserName.setPreferredSize(new Dimension(200, 20));
        panelEast.add(lblUserName);
        panelEast.add(txtUserName);


        lblPassword.setPreferredSize(new Dimension(193, 20));
        pswdPassword.setPreferredSize(new Dimension(200, 20));
        panelEast.add(lblPassword);
        panelEast.add(pswdPassword);
        panelSouth.add(btnLogin);
        panelSouth.add(btnExit);

        mainFrame.setPreferredSize(new Dimension(400, 150));
        mainFrame.add(panelNorth, BorderLayout.NORTH);
        mainFrame.add(panelWest, BorderLayout.WEST);
        mainFrame.add(panelEast, BorderLayout.EAST);
        mainFrame.add(panelSouth, BorderLayout.SOUTH);

        btnLogin.addActionListener(this);
        btnExit.addActionListener(this);
        setColors();
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

    //Displaying message if the username and/or password is empty
    public boolean ifLoginEmpty()
    {
        boolean flag =true;
        if(txtUserName.getText().isEmpty()  && String.valueOf(pswdPassword.getPassword()).isEmpty())
        {
            showMessageDialog(null, "Please enter your credentials");
            flag =false;
        }
        else
            if(txtUserName.getText().isEmpty())
            {
                showMessageDialog(null ,"Please enter your username");
                flag =false;
            }
            else
                if(String.valueOf(pswdPassword.getPassword()).isEmpty())
                {
                    showMessageDialog(null ,"Please enter your password");
                    flag =false;
                }
        return flag;
    }

    //Giving a message to the user, based on if the password is valid
    public void passwordMessageToUser()
    {
        boolean pass;
        String password = String.valueOf(pswdPassword.getPassword());
        pass = passwordValidation(password);
        if(pass == false)
        {
            showMessageDialog(null, "The password needs to be 8 characters or longer," +
                    " have a Uppercase(A-Z), lowercase(a-z), numbers(1-9) and special characters(!, #, $)");
        }else {
            checkUser();
        }
    }

    //Adding users to an array, to test if the login will work
    public User[] addUsers()
    {
        User[] users = new User[3];

        users[0] = UserFactory.build("Wilbur", "123Wilb!@#");
        users[1] = UserFactory.build("Mike", "Bob78%^&");
        users[2] = UserFactory.build("Sarah", "Sa478%^&");

        return users;
    }

    public void checkUser()
    {
        User[] users = addUsers();

        for(int i =0; i > users.length; i++)
        {
            if(txtUserName.getText().equals(users[i].getName())  &&
                    String.valueOf(pswdPassword.getPassword()).equals(users[i].getPassword()) )
            {
                 showMessageDialog(null, "Welcome: " +
                         String.valueOf(pswdPassword.getPassword()));
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnLogin)
        {
           if(ifLoginEmpty() == true)
           {
               mainFrame.dispose();
               FoodDrinkSelection foodAndDrink = new FoodDrinkSelection();
               foodAndDrink.setFoodDrinkGUI();
           }
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
