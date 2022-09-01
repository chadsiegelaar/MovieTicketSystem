package za.ac.cput.service;

import za.ac.cput.domain.Register;


import java.util.List;

public interface RegisterService extends IService<Register, String>
{
    void deleteById(String id);

    List<Register> findAll();
}
