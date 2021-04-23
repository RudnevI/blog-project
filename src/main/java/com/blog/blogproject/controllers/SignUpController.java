package com.blog.blogproject.controllers;

import com.blog.blogproject.entity.DbUser;
import com.blog.blogproject.service.implementations.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUpController {


    private final UserServiceImpl service;

    public SignUpController(UserServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/signup")
    public String signUp() {
        return "registration";
    }

    @PostMapping("/signup")
    public String signUp(
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String userName
    ) {

        DbUser user = new DbUser(userName, email, password);

        service.saveUser(user);

        return "/login";
    }
}
