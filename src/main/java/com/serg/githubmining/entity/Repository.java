package com.serg.githubmining.entity;

public class Repository {
    private String name;
    private String description;
    private int stargazers_count;
    private int forks;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getStars() {
        return stargazers_count;
    }

    public int getForks() {
        return forks;
    }
}
