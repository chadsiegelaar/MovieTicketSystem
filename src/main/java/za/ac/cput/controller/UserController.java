package za.ac.cput.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.domain.User;
import za.ac.cput.service.UserService;
import za.ac.cput.service.UserServiceimpl;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("movie-ticket/user/")
@Slf4j
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserServiceimpl userService)
    {
        this.userService = userService;
    }

    @PostMapping("save")
    public ResponseEntity<User> save( @Valid @RequestBody User user)
    {
        log.info("Save Request: {}", user);
        User save = this.userService.save(user);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{id}")
    public ResponseEntity<User> read(@PathVariable String id)
    {
        log.info("Read Request: {}", id);
        User user = this.userService.read(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id)
    {
        log.info("Delete Request: {}", id);
        this.userService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<List<User>> findAll()
    {
        List<User> users = this.userService.findAll();
        return ResponseEntity.ok(users);
    }
}
