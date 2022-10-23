package za.ac.cput.factory;


import za.ac.cput.domain.Register;
import za.ac.cput.helper.RepositoryHelper;


public class RegisterFactory {
    public static Register build(String firstName, String lastName, String email, String cellNumber, String username, String password)
    {
        if (RepositoryHelper.isNullorEmpty(firstName)||
                RepositoryHelper.isNullorEmpty(lastName) ||
                RepositoryHelper.isNullorEmpty(cellNumber) ||
                RepositoryHelper.isNullorEmpty(username) ||
                RepositoryHelper.isNullorEmpty(password) ||
                RepositoryHelper.isNullorEmpty(email))
            return null;

        return  new Register.Builder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setCellNumber(cellNumber)
                .setEmail(email)
                .setUsername(username)
                .setPassword(password)
                .build();
    }
}
