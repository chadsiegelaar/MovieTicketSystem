package za.ac.cput.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.domain.Register;
import za.ac.cput.service.RegisterService;
import za.ac.cput.service.RegisterServiceimpl;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("movie-ticket/register/")
@Slf4j

public class RegisterController {
    private final RegisterService registerService;

    @Autowired
    public RegisterController(RegisterServiceimpl registerService)
    {
        this.registerService = registerService;
    }

    @PostMapping("save")
    public ResponseEntity<Register> save(@Valid @RequestBody Register register)
    {
        log.info("Save Request: {}", register);
        Register save = this.registerService.save(register);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{id}")
    public ResponseEntity<Register> read(@PathVariable String id)
    {
        log.info("Read Request: {}", id);
        Register user = this.registerService.read(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id)
    {
        log.info("Delete Request: {}", id);
        this.registerService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<List<Register>> findAll()
    {
        List<Register> users = this.registerService.findAll();
        return ResponseEntity.ok(users);
    }
}

