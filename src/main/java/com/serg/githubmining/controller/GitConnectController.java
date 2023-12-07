package com.serg.githubmining.controller;

import com.serg.githubmining.service.GithubConnect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/github")
public class GitConnectController {

    @Autowired
    private GithubConnect githubConnect;

    @PostMapping("/connect")
    public Object connect() {
        return githubConnect.connect();
    }

    @PostMapping("/stars")
    public Object starsTest() {
        return githubConnect.starsTest();
    }
}
