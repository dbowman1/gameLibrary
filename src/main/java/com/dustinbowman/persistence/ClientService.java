package com.dustinbowman.persistence;


import com.dustinbowman.utilities.PropertiesLoader;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.igdb.api.GameResults;
import com.mashape.unirest.http.HttpResponse;

import com.mashape.unirest.http.Unirest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class ClientService implements PropertiesLoader {

    private List<GameResults> apiGameResults;
    private String gameUrl;
    private String apikey;
    private final Logger logger = LogManager.getLogger(this.getClass());

    public ClientService() {
        Properties properties = loadProperties("/config.properties");
        gameUrl = properties.getProperty("gamesUrl");
        apikey = properties.getProperty("apikey");
        apiGameResults = new ArrayList<>();
    }

    public List getApiGame(String params)  {

        try {
            HttpResponse<String> response = Unirest.post(gameUrl)
                    .header("user-key", apikey)
                    .header("Accept", "application/json")
                    .body(params)
                    .asString();
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            GameResults[] games = mapper.readValue(response.getBody(), GameResults[].class);
            apiGameResults.addAll(Arrays.asList(games));
        } catch (Exception e) {
            logger.error("Error with API call: ", e);
        }

        return apiGameResults;

    }
}
