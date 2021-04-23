package com.blog.blogproject.controllers;

import com.blog.blogproject.entity.DbPost;
import com.blog.blogproject.service.implementations.PostServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddPostController {

    private final PostServiceImpl service;

    public AddPostController(PostServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/add-post")
    public String addPost() {

        return "add-post";
    }

    @PostMapping("/add-post")
    public String addPost(

            @RequestParam String header,
            @RequestParam String content
    ) {

        DbPost post = new DbPost(header, content);

        service.savePost(post);

        return "/main";



    }
}
