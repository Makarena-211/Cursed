package com.example.net.proselyte.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.print.attribute.standard.Media;

@Controller
public class PageController {
    @GetMapping("/")
    public String showHomePage(){
        return "home";
    }
}
