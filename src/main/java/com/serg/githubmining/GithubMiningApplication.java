package com.serg.githubmining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class GithubMiningApplication {

	public static void main(String[] args) {
		// Load the properties.
		System.setProperty("spring.config.name", "github-mining");
		SpringApplication.run(GithubMiningApplication.class, args);
	}

}
