package com.mongo.jpa.controller;

import com.mongo.jpa.domain.PhoneNumber;
import com.mongo.jpa.domain.User;
import com.mongo.jpa.repository.PhoneNumberDaoRepository;
import com.mongo.jpa.repository.UserDaoRepository;
import com.mongo.jpa.sequencegenerator.SequenceGeneratorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    @Autowired
    private UserDaoRepository userDaoRepository;

    @Autowired
    private PhoneNumberDaoRepository phoneNumberDaoRepository;


    @GetMapping("/")
    public List<User> userDetails() {
        LOG.info("Inside UserDetails {}");
        List<User> allUsers = userDaoRepository.findAll();
        System.out.println(allUsers);
        return allUsers;
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        user.setId(sequenceGeneratorService.generateSequence(User.SEQUENCE));
        user.getPhoneNumbers().forEach(p ->
        {
            System.out.println("p->" + p);
            p.setId(sequenceGeneratorService.generateSequence(PhoneNumber.SEQUENCE));
            phoneNumberDaoRepository.save(p);
        });
        System.out.println("User ->>>" + user);
        Long id = userDaoRepository.save(user).getId();
        return id.toString();
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll() {
        userDaoRepository.deleteAll();
    }
}
