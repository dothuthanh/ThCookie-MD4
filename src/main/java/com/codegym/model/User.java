package com.codegym.model;

import org.springframework.web.bind.annotation.ModelAttribute;

public class User {
    private String email;
    private String password;
    public User() {

    }

    public User(String email, String paswork) {
        this.email = email;
        this.password = paswork;
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
}
