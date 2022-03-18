import nl.marisabel.services.twitter.TwitterAPI;
import nl.marisabel.services.twitter.TwitterService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(MockitoExtension.class)
@DisplayName("Testing Twitter Service")
public class twitterTest {

    @Mock
    private TwitterService twitterService;

    @Mock
    private TwitterAPI api;

    @Test
    @DisplayName("Does it send tweet to DTO?")
    public void testCreateTweet() throws IOException, TwitterException {
        TwitterService twitterService = new TwitterService();
        twitterService.createTweet("A test tweet");
        assertEquals("A test tweet", twitterService.getTweet());
        // succesful also send the tweet to my account
    }

    @Test
    @DisplayName("Does it connect to API?")
    public void testTwitterApiConnection() throws IOException {
        TwitterAPI api = new TwitterAPI();
        Twitter connect = api.createConnection();
        assertNotNull(connect);
    }

}
