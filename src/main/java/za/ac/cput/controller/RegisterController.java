package za.ac.cput.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Register;
import za.ac.cput.service.RegisterServiceimpl;


import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("movie-ticket/register/")
@Slf4j
public class RegisterController {

    private RegisterServiceimpl registerService;

    @Autowired
    public RegisterController(RegisterServiceimpl registerService) {
        this.registerService = registerService;
    }

    @PostMapping("save/")
    public Register save(@Valid @RequestBody Register register) {
        log.info("Save Request: {}", register);
        return this.registerService.save(register);
    }

    @GetMapping("all/")
    public List<Register> findAll() {
        return this.registerService.findAll();
    }

    @GetMapping("read/{id}")
    public Optional<Register> read(@PathVariable String id)
    {
        log.info("Read Request: {}", id);
        return this.registerService.read(id);
    }
    @DeleteMapping("delete/{FirstName}")
    public boolean delete(@PathVariable String FirstName){
        registerService.delete(FirstName);
        return true;
    }
    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable String id) {
        this.registerService.deleteById(id);

    }

}

