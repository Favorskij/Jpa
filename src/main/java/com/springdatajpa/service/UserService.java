package com.springdatajpa.service;

import com.springdatajpa.model.User;
import com.springdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;


    public User getUser (String username) {
        return userRepository.findByUsername(username);
    }


    public void save (User user) {
        userRepository.save(user);
    }
}
