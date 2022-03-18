package nl.marisabel.services.twitter;

import org.springframework.stereotype.Service;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import java.io.IOException;

@Service
public class TwitterService {

    private String tweet;


    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }


    public void createTweet(String tweet) throws TwitterException, IOException {
        TwitterAPI api = new TwitterAPI();
        Twitter twitter = api.createConnection();
        Status status = twitter.updateStatus(tweet);
        setTweet(tweet);
        status.getText();
    }



}
