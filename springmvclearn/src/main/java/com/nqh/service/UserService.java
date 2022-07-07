package com.nqh.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.nqh.pojos.User;

public interface UserService extends UserDetailsService {
    boolean addUser(User user);
    List<User> getUsers(String username);
    
}
