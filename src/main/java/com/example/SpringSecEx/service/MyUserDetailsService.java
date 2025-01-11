package com.example.SpringSecEx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.SpringSecEx.Model.UserPrincipal;
import com.example.SpringSecEx.Model.Users;
import com.example.SpringSecEx.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        Users user = repo.findByusername(username);

        if(user == null)
        {
            throw new UsernameNotFoundException("username not found");
        }

        return new UserPrincipal(user);
        
    }
    
}
