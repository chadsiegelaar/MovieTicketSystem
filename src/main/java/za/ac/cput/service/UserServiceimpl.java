package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.User;
import za.ac.cput.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceimpl implements UserService{

    private final UserRepository repository;

    @Autowired
    private UserServiceimpl(UserRepository userRepository)
    {
        this.repository = userRepository;
    }

    @Override
    public User save(User user) {
        return this.repository.save(user);
    }

    @Override
    public Optional<User> read(String s) {
        return this.repository.findById(s);
    }

    @Override
    public boolean delete(User user) {
        this.repository.delete(user);
        return false;
    }

    @Override
    public void deleteById(String id)
    {
        this.repository.deleteById(id);
    }

    @Override
    public List<User> findAll() {
        return this.repository.findAll();
    }
}
