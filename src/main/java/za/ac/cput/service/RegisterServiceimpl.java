
package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Register;
import za.ac.cput.repository.RegisterRepository;


import java.util.List;
import java.util.Optional;
@Service
public class RegisterServiceimpl implements RegisterService {

    private RegisterRepository repository;

    @Autowired
    public RegisterServiceimpl(RegisterRepository repository)
    {
        this.repository = repository;
    }

    public Register save(Register register) {
        return this.repository.save(register);
    }

    @Override
    public Optional<Register> read(String s) {
        return this.repository.findById(s);
    }

    public boolean delete(String FirstName){
        if(this.repository.existsById(FirstName)){
            this.repository.deleteById(FirstName);
            return true;
        }
        return false;
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
