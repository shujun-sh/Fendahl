package com.serg.githubmining.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/home")
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index"; // Assuming "index" is the name of your default page
    }
    @GetMapping("/hi")
    public String sayHello() {
        return "hi";
    }
}
