package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.domain.Register;
import za.ac.cput.repository.RegisterRepository;


import java.util.List;
import java.util.Optional;

public class RegisterServiceimpl implements RegisterService{

    private final RegisterRepository repository;

    @Autowired
    private RegisterServiceimpl(RegisterRepository registerRepository)
    {
        this.repository = registerRepository;
    }

    @Override
    public Register save(Register register) {
        return this.repository.save(register);
    }

    @Override
    public Optional<Register> read(String s) {
        return this.repository.findById(s);
    }

    @Override
    public void delete(Register register) {
        this.repository.delete(register);
    }

    @Override
    public void deleteById(String id)
    {
        this.repository.deleteById(id);
    }

    @Override
    public List<Register> findAll() {
        return this.repository.findAll();
    }
}