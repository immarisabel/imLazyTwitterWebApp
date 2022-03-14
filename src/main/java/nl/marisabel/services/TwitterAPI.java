package nl.marisabel.services;

import org.springframework.stereotype.Service;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Service
public class TwitterAPI {

    public Twitter createConnection() throws IOException {

        String path = "classpath:twitter4j.properties";
        String apikeys = path;
        Properties properties = new Properties();
        properties.load(new FileInputStream(apikeys));
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(properties.getProperty("oauth.consumerKey"))
                .setOAuthConsumerSecret(properties.getProperty("oauth.consumerSecret"))
                .setOAuthAccessToken(properties.getProperty("oauth.accessToken"))
                .setOAuthAccessTokenSecret(properties.getProperty("oauth.accessTokenSecret"));
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();

        return twitter;
    }

    public String createTweet(String tweet) throws TwitterException, IOException {
        Twitter twitter = createConnection();
        Status status = twitter.updateStatus(tweet);
        return status.getText();
    }


}


