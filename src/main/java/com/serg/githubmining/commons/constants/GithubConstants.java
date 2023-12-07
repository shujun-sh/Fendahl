package com.serg.githubmining.commons.constants;

import org.springframework.beans.factory.annotation.Value;

public class GithubConstants {
    // token
    public static String GITHUB_TOKEN = System.getenv("github.token");
}
