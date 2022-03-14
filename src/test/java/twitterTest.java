import nl.marisabel.services.TwitterAPI;
import org.junit.Test;
import twitter4j.TwitterException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static org.junit.Assert.assertEquals;

public class twitterTest {

    @Test
    public void propertiesTest() throws IOException {

        String appConfigPath = "classpath:twitter4j.properties";

        Properties properties = new Properties();
        properties.load(new FileInputStream(appConfigPath));

        String test = properties.getProperty("test.test");
        assertEquals("test", test);

    }

    @Test
    public void connectiontest() throws IOException {
        TwitterAPI twitter = new TwitterAPI();
        System.out.println(twitter.createConnection());
    }

    @Test
    public void sendTweetTest() throws IOException, TwitterException {
        TwitterAPI twitter = new TwitterAPI();
        twitter.createTweet("Hello!");
    }




}
