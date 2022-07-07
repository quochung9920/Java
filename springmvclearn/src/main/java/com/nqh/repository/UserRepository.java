package com.nqh.repository;

import java.util.List;

import com.nqh.pojos.User;

public interface UserRepository {
    boolean addUser(User user);
    List<User> getUsers(String username);
}
