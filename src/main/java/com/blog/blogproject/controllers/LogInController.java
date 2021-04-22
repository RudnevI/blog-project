package com.blog.blogproject.controllers;

import com.blog.blogproject.entity.DbUser;
import com.blog.blogproject.service.implementations.UserServiceImpl;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogInController {

    private final UserServiceImpl service;

    public LogInController(UserServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/login")
    public String logIn(Model model) {

        model.addAttribute("currentUser", getUser());
        return "login";
    }

    private DbUser getUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            User user = (User) authentication.getPrincipal();
            return service.findUserByEmail(user.getUsername());
        }
        return null;
    }


}
