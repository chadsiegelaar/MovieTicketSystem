package za.ac.cput.service;



import za.ac.cput.domain.Register;


import java.util.List;
import java.util.Optional;

public interface RegisterService {

    Register save(Register register);
    List<Register> findAll();

    void deleteById(String id);

    Optional<Register> read(String s);

    Register save(Register register);
}
