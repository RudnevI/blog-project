package com.blog.blogproject.controllers;


import com.blog.blogproject.service.implementations.PostServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private final PostServiceImpl service;

    public MainController(PostServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/")
    public String main(Model model) {

        model.addAttribute("posts", service.findAllPosts());
        return "main";
    }

}