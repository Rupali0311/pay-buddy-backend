package com.learn.pay_buddy_backend.controller;

import com.learn.pay_buddy_backend.model.User;
import com.learn.pay_buddy_backend.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public User getUser(){
        return userRepository.findById(UUID.fromString("fc858ee0-d69e-4412-a75b-9e7fd0fb73ca"))
                .orElseThrow(() -> new RuntimeException("User not found!"));
    }
}
