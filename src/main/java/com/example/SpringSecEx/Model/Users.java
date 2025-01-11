package com.example.SpringSecEx.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document (collection = "users")
public class Users {

    @Id
    private Integer id;
    private String username;
    private String password;
    
}
