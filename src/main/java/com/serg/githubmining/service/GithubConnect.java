package com.serg.githubmining.service;

import org.kohsuke.github.GHMyself;

import java.util.List;

public interface GithubConnect {

    GHMyself connect();

    List<String> starsTest();
}
