package com.mongo.morphia.controller;

import com.mongo.morphia.domain.User;
import com.mongo.morphia.repository.UserDaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDaoRepository userDaoRepository;


    @GetMapping("/")
    public List<User> userDetails() {
        List<User> allUsers = userDaoRepository.getAllUsers();
        System.out.println(allUsers);
        return allUsers;
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        return userDaoRepository.addUser(user);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll() {
        userDaoRepository.deleteAll();
    }
}
