package com.springdatajpa.service;

import com.springdatajpa.model.User;

public interface UserService {

    User findByUsername(String username);
    void save(User user);
}
