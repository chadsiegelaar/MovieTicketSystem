package za.ac.cput.factory;

import za.ac.cput.domain.User;

public class UserFactory
{
    public static User build(String name, String password)
    {
        if(name == null ||name.isEmpty())
            System.out.println("Password required");

        if(password == null ||password.isEmpty())
            System.out.println("Password is required");

        return new User.Builder().setName(name)
                .setPassword(password)
                .build();
    }
}
