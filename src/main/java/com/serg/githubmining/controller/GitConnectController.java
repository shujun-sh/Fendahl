package com.serg.githubmining.controller;

import com.serg.githubmining.service.GithubConnect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitConnectController {

    @Autowired
    private GithubConnect githubConnect;

    @PostMapping("/connect")
    public String connect() {
        githubConnect.connect();
        return "I got it";
    }
}
