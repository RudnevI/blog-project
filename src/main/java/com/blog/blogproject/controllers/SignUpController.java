package com.blog.blogproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUpController {

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

        
        return "/login";
    }
}
