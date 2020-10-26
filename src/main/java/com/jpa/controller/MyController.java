package com.jpa.controller;

import com.jpa.model.User;
import com.jpa.service.UserService;
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

        User user = new User();
        user.setUsername("Gena");

        userService.save(user);

        System.out.println(userService.findByUsername("roma").getUsername());


        return userService.findByUsername("roma").getUsername();

    }


}
