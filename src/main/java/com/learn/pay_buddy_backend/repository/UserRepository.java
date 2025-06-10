package com.learn.pay_buddy_backend.repository;

import com.learn.pay_buddy_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface UserRepository extends JpaRepository<User, UUID> {

}
