package nl.marisabel.services.twitter;

import nl.marisabel.services.LoadApiKeysPropertiesFile;
import org.springframework.stereotype.Service;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Service
public class TwitterAPI {


    public Twitter createConnection() throws IOException {
        LoadApiKeysPropertiesFile apiKeys = new LoadApiKeysPropertiesFile();
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(apiKeys.twitterConsumerKey())
                .setOAuthConsumerSecret(apiKeys.twitterConsumerSecret())
                .setOAuthAccessToken(apiKeys.twitterAccessToken())
                .setOAuthAccessTokenSecret(apiKeys.twitterToken());
        TwitterFactory twitterFactory = new TwitterFactory(cb.build());
        Twitter twitter = twitterFactory.getInstance();

        return twitter;
    }



}


