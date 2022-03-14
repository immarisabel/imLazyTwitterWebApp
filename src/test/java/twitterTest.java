import nl.marisabel.dto.Twitter;
import nl.marisabel.dto.WebText;
import nl.marisabel.services.TwitterAPI;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import twitter4j.TwitterException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static org.junit.Assert.assertEquals;

public class twitterTest {

    @Test
    public void propertiesTest() throws IOException {

        Twitter t = new Twitter();
        assertEquals("test", t.getTest());
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
