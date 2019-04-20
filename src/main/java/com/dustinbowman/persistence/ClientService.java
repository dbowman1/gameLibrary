package com.dustinbowman.persistence;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.igdb.api.GameResults;
import com.mashape.unirest.http.HttpResponse;

import com.mashape.unirest.http.Unirest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ClientService {

    private Properties properties;
    private HttpResponse<String> response;
    private List<GameResults> apiGameResults;
    private String gameUrl;
    private String apikey;
    private final Logger logger = LogManager.getLogger(this.getClass());

    public ClientService() {
        loadProperties();
        gameUrl = properties.getProperty("gamesUrl");
        apikey = properties.getProperty("apikey");
        apiGameResults = new ArrayList<>();
    }
    private void loadProperties() {
        properties = new Properties();
        try {
            properties.load (this.getClass().getResourceAsStream("/config.properties"));
        } catch (IOException ioe) {
            logger.error("Cannot load the properties file", ioe);
        } catch (Exception e) {
            logger.error("exception", e);
        }

    }

    public List getApiGame(String params)  {


        try {
            response = Unirest.post(gameUrl)
                    .header("user-key", apikey)
                    .header("Accept", "application/json")
                    .body(params)
                    .asString();
            ObjectMapper mapper = new ObjectMapper();
            GameResults[] games = mapper.readValue(response.getBody(), GameResults[].class);
            for (int i = 0; i < games.length; i++) {
                apiGameResults.add(games[i]);
            }
        } catch (Exception e) {
            logger.error("Error with API call: ", e);
        }

        return apiGameResults;

    }
}
