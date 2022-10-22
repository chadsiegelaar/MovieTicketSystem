package za.ac.cput.factory;

import za.ac.cput.domain.Register;
import za.ac.cput.domain.User;

public class RegisterFactory {
    public static Register build(String username, String password)
    {
        if(username == null ||username.isEmpty())
            System.out.println("Password required");

        if(password == null ||password.isEmpty())
            System.out.println("Password is required");

        return new Register.Builder().setusername(username)
                .setpassword(password)
                .build();
    }
}
