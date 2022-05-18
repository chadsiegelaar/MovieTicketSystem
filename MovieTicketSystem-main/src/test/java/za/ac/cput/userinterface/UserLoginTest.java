package za.ac.cput.userinterface;

import za.ac.cput.userinterface.UserLogin;
import org.junit.jupiter.api.Test;

class UserLoginTest
{
    UserLogin loginGUI;

    @Test
    public void createGUI()
    {
        loginGUI = new UserLogin();
        loginGUI.setGUI();
    }

}