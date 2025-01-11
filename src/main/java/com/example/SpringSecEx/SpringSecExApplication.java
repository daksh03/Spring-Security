package com.example.SpringSecEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SpringSecEx.service.UserService;

@SpringBootApplication
public class SpringSecExApplication implements CommandLineRunner {

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecExApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userService.createUser();
	}

}
