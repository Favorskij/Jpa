package com.jpa.service;

import com.jpa.model.User;

public interface UserService {

    User findByUsername(String username);
    void save(User user);
}
