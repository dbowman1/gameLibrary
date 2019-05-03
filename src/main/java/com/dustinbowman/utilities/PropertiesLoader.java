package com.dustinbowman.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Properties;

/**
 * The interface Properties loader.
 */
public interface PropertiesLoader {

    /**
     * Load properties properties.
     *
     * @param propertiesFilePath the properties file path
     * @return the properties
     */
    default Properties loadProperties(String propertiesFilePath) {
        final Logger logger = LogManager.getLogger(this.getClass());
        Properties properties = new Properties();


        try{
            properties.load(this.getClass().getResourceAsStream(propertiesFilePath));
        } catch (IOException io) {
            logger.error("IO exception", io);
        } catch (Exception ex) {
            logger.error("Exception error", ex);
        }

        return properties;
    }
}
