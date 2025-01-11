package com.example.SpringSecEx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringSecEx.Model.Users;
import com.example.SpringSecEx.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    UserRepo repo;

    public void createUser() {
        Users user = new Users();
        user.setId(1);
        user.setUsername("hello");
        user.setPassword("hello");
        repo.save(user);
    }
    
}
