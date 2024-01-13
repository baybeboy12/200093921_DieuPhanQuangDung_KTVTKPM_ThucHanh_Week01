package com.example.controllers;

import com.example.models.Users;
import com.example.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController

public class UsersController {
    @Autowired
    private UsersRepository usersRepository;
    @GetMapping("/users")
    List<Users> findAllUsers(){
        return usersRepository.findAll();
    }
}
