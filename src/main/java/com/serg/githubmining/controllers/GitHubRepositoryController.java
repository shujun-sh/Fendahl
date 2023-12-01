package com.serg.githubmining.controllers;

import com.serg.githubmining.entities.GitHubRepository;
import com.serg.githubmining.services.GitHubApi;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/repository")
public class GitHubRepositoryController {

    /**
     * GitHub API connection service.
     */
    @Autowired
    private transient GitHubApi gitHubApi;

    @GetMapping(path = "/info/{owner}/{repositoryName}")
    public @ResponseBody GitHubRepository getRepositoryInfo(@PathVariable String owner, @PathVariable String repositoryName) {
        JSONObject repositoryInfo = gitHubApi.getRepositoryInfo(owner, repositoryName);
        System.out.println(repositoryInfo);
        return new GitHubRepository(repositoryName, owner, 0);
    }
}
