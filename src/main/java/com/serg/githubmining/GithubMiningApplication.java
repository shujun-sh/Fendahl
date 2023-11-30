package com.serg.githubmining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GithubMiningApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubMiningApplication.class, args);
	}

}
