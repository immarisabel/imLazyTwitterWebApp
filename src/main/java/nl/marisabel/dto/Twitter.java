package nl.marisabel.dto;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("twitter")
public class Twitter {

    @Getter
    @Value("${oauth.consumerKey}")
    public String consumerKey;

    @Getter
    @Value("${oauth.consumerSecret}")
    public String consumerSecret;

    @Getter
    @Value("${oauth.accessToken}")
    public String accessToken;

    @Getter
    @Value("${oauth.accessTokenSecret}")
    public String accessTokenSecret;

}
