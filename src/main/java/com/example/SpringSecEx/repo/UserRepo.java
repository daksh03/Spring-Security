package com.example.SpringSecEx.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringSecEx.Model.Users;

@Repository
public interface UserRepo extends MongoRepository<Users, Integer>{

    Users findByusername(String username);
    
}
