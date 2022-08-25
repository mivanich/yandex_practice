package com.psgr_spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@Service
@RestController
public class UserController {
    @Autowired private UserRepository repository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return this.repository.findAll();
    }

    @PostMapping("/user")
    public void addNewUser(@RequestBody User newUser) {
        this.repository.save(newUser);
    }
}