package za.ac.cput.service;

import za.ac.cput.domain.User;

public interface UserService extends IService<User, String>
{
    void deleteById(String id);
}
