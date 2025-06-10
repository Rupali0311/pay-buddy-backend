package com.learn.pay_buddy_backend.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "users", schema ="pay_buddy")
public class User {
    public User(String name, String email, String password, LocalDateTime createdAt, String refreshToken) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
        this.refreshToken = refreshToken;
    }

    public User() {
    }


    @Id
    @Column(name="id", columnDefinition = "UUID")
    private UUID id;

    @Column(name="name", length = 50)
    private String name;

    @Column(name="email", length = 50)
    private String email;

    @Column(name="password", columnDefinition = "TEXT")
    private String password;

    @Column(name="created_at", columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(name="refresh_token", columnDefinition = "TEXT")
    private String refreshToken;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
