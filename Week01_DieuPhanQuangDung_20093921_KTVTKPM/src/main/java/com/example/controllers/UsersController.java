package com.example.controllers;

import com.example.models.Users;
import com.example.repositorries.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @GetMapping("/users/{id}")
    Users getUsersById(@PathVariable("id") long id){
        return usersRepository.findById(id).get();
    }

}
