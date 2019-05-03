package com.dustinbowman.persistence;


import com.dustinbowman.utilities.PropertiesLoader;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.igdb.api.GameResults;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestGameApi implements PropertiesLoader {
    private final Logger logger = LogManager.getLogger(this.getClass());

    private String allHeaders;
    private ClientService cs;


    @BeforeEach
    void setUp() {
        Properties properties = loadProperties("/config.properties");
        String apikey = properties.getProperty("apikey");
        String gameUrl = properties.getProperty("gameUrl");
        String newReleaseUrl = properties.getProperty("newReleaseUrl");
        allHeaders = properties.getProperty("allHeaders");
        cs = new ClientService();
        ObjectMapper mapper = new ObjectMapper();

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
