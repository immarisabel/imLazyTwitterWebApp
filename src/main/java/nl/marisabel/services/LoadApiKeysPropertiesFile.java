package nl.marisabel.services;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadApiKeysPropertiesFile {

    private Properties loadApiKeysPropertiesFile() throws IOException {
        String path = "C:\\Users\\Administrator\\Documents\\Programming\\PROJECTS\\imLazyApp\\src\\main\\resources\\ApiKeys.properties";
        String apikeys = path;
        Properties properties = new Properties();
        properties.load(new FileInputStream(apikeys));
        return properties;
    }

    public String twitterConsumerKey() throws IOException {
        return loadApiKeysPropertiesFile().getProperty("oauth.consumerKey");
    }

    public String twitterConsumerSecret() throws IOException {
        return loadApiKeysPropertiesFile().getProperty("oauth.consumerSecret");
    }

    public String twitterAccessToken() throws IOException {
        return loadApiKeysPropertiesFile().getProperty("oauth.accessToken");
    }

    public String twitterToken() throws IOException {
        return loadApiKeysPropertiesFile().getProperty("oauth.accessTokenSecret");
    }

    public String locationApiKey() throws IOException {
        return loadApiKeysPropertiesFile().getProperty("oauth.locationAPIKey");
    }

    public String weatherApiKey() throws IOException {
        return loadApiKeysPropertiesFile().getProperty("oauth.weatherAPIKey");
    }


}
