package com.serg.githubmining.entities;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GitHubRepositoryTest {
    private static GitHubRepository repository;

    @BeforeAll
    public static void setup() {
        repository = new GitHubRepository("test_name", "test description", 10);
    }

    @Test
    public final void testGetSetName() {
        assertEquals("test_name", repository.getName());
        repository.setName("new_name");
        assertEquals("new_name", repository.getName());
    }

    @Test
    public final void testGetSetDescription() {
        assertEquals("test description", repository.getDescription());
        repository.setDescription("new description");
        assertEquals("new description", repository.getDescription());
    }

    @Test
    public final void testGetSetStarsCounter() {
        assertEquals(10, repository.getStargazersCount());
        repository.setStargazersCount(20);
        assertEquals(20, repository.getStargazersCount());
    }
}
