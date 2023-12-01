package com.serg.githubmining.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;

import lombok.extern.java.Log;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 * GitHub API Interface Service.
 */
@Log
@Service
public class GitHubApi {
    private static final HttpClient CLIENT = HttpClient.newHttpClient();
    private static final String GITHUB_API_URL = "https://api.github.com";
    private static final String GITHUB_AUTH_TOKEN = System.getProperty("GITHUB_AUTH_TOKEN","");; // Your GitHub Auth Token here

    /**
     * GET GitHub repository information through the GitHub API.
     *
     * @param owner - The repository owner.
     * @param repositoryName - The repository name.
     * @return The request JSON object.
     */
    public JSONObject getRepositoryInfo(String owner, String repositoryName) {
        HttpRequest request = HttpRequest.newBuilder()
                .header("Authorization","Bearer " + GITHUB_AUTH_TOKEN)
                .uri(
                        URI.create(GITHUB_API_URL + String.format("/repos/%s/%s", owner, repositoryName))
                )
                .build();

        try {
            HttpResponse<String> httpResponse = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

            if (httpResponse == null || httpResponse.statusCode() != 200) {
                return null;
            }

            try {
                return new JSONObject(
                        httpResponse.body()
                );
            } catch (org.json.JSONException exception) {
                log.log(Level.WARNING, exception.getMessage(), exception);
                return null;
            }

        } catch (Exception exception) {
            log.log(Level.WARNING, exception.getMessage(), exception);
            return null;
        }
    }
}
