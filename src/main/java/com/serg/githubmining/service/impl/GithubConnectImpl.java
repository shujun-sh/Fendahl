package com.serg.githubmining.service.impl;


import com.serg.githubmining.commons.constants.GithubConstants;
import com.serg.githubmining.service.GithubConnect;
import org.kohsuke.github.*;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GithubConnectImpl implements GithubConnect {

    @Override
    public GHMyself connect() {
        try {
            GitHub github = new GitHubBuilder().withAppInstallationToken(GithubConstants.GITHUB_TOKEN).build();
            return github.getMyself();
        } catch (IOException e) {
            e.printStackTrace();
            return new GHMyself();
        }
    }

    @Override
    public List<String> starsTest() {
        try {
            GitHub github = new GitHubBuilder().withAppInstallationToken(GithubConstants.GITHUB_TOKEN).build();
            GHRepositorySearchBuilder builder = github.searchRepositories();
            builder.language("Java");
            builder.stars(">5000");
            builder.sort(GHRepositorySearchBuilder.Sort.STARS);
            PagedIterable<GHRepository> repositories = builder.list();
            return repositories.toList().stream()
                    .map(GHRepository::getFullName)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
