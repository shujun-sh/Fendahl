package com.serg.githubmining.entities;

/**
 * GitHub Repository class.
 */
public class Repository {
    private String name;
    private String description;
    private int stargazersCount;

    /**
     * Constructor for GitHub Repository class.
     * @param name - The repository name.
     * @param description - The repository description.
     * @param stargazersCount - The repository stars count.
     */
    public Repository(String name, String description, int stargazersCount) {
        this.name = name;
        this.description = description;
        this.stargazersCount = stargazersCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(int stargazersCount) {
        this.stargazersCount = stargazersCount;
    }
}
