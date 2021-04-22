package com.blog.blogproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OptionsController {

    @GetMapping("options")
    public String options() {
        return "options";
    }
}
