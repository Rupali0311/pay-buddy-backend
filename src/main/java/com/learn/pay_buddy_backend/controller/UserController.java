package com.learn.pay_buddy_backend.controller;

import com.learn.pay_buddy_backend.model.User;
import com.learn.pay_buddy_backend.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public User getUser(){
        return userRepository.findById(1L)
                .orElseThrow(() -> new RuntimeException("User not found!"));
    }
}
