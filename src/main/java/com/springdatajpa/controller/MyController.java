package com.springdatajpa.controller;

import com.springdatajpa.model.User;
import com.springdatajpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {


    @Autowired
    UserService userService;


    @ResponseBody
    @GetMapping(value = "/")
    public String home () {

        User user = userService.getUser("roma");

        return user.getUsername();
    }


    @ResponseBody
    @GetMapping(value = "/add")
    public String save () {

        User user = new User();
        user.setUsername("Vity");

        userService.save(user);

        return "Hello World !!!";
    }


}
