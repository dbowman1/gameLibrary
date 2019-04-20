package com.dustinbowman.persistence;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.igdb.api.GameResults;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestGameApi {
    private final Logger logger = LogManager.getLogger(this.getClass());

    private Properties properties;
    private String apikey;
    private String gameUrl;
    private String newReleaseUrl;
    private String allHeaders;
    private ObjectMapper mapper;
    private ClientService cs;

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

    @BeforeEach
    void setUp() {
        loadProperties();
        apikey = properties.getProperty("apikey");
        gameUrl = properties.getProperty("gameUrl");
        newReleaseUrl = properties.getProperty("newReleaseUrl");
        allHeaders = properties.getProperty("allHeaders");
        cs = new ClientService();
        mapper = new ObjectMapper();

    }


    @Test
    public void testGameApiJson() {
        ClientService cs = new ClientService();
        String params = "where id = 1029;\n" + allHeaders;
        List<GameResults> gameResults = cs.getApiGame(params);

        String name = gameResults.get(0).getName();
        assertEquals("The Legend of Zelda: Ocarina of Time", name);


    }

    @Test
    public void testApiNewGame() {
        String params = "fields name, release_dates.*;where platforms = 48 & release_dates.date > 1538129354; sort date asc; limit 10;";
        List<GameResults> gameResults = cs.getApiGame(params);
        assertEquals(gameResults.size(), 10);
    }

}
