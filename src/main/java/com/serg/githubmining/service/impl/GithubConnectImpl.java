package com.serg.githubmining.service.impl;

import com.google.gson.Gson;
import com.serg.githubmining.entity.Repository;
import com.serg.githubmining.service.GithubConnect;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GithubConnectImpl implements GithubConnect {
    private static final String GITHUB_API_URL = "https://api.github.com";
    private static final String OWNER = "your-username";
    private static final String REPO = "your-repository";

    @Override
    public void connect() {
        try {
            OkHttpClient client = new OkHttpClient();
            Gson gson = new Gson();

            // Create a request to fetch repository details
            Request request = new Request.Builder()
                    .url(GITHUB_API_URL + "/repos/" + OWNER + "/" + REPO)
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            // Send the request and retrieve the response
            Response response = client.newCall(request).execute();

            // Parse the JSON response
            if (response.isSuccessful()) {
                Repository repository = gson.fromJson(response.body().string(), Repository.class);
                System.out.println("Repository Name: " + repository.getName());
                System.out.println("Repository Description: " + repository.getDescription());
                System.out.println("Repository Stars: " + repository.getStars());
                // ...
            } else {
                System.out.println("Request failed with code: " + response.code());
            }
        } catch (IOException e) {

        }
    }
}
