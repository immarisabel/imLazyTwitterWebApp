package nl.marisabel;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("webtext")
public class WebText {

    @Getter
    public String date;

    @Getter
    @Value("${text.header.title}")
    public String headerTitle;

    @Getter
    @Value("${text.about.title}")
    public String aboutTitle;

    @Getter
    @Value("${text.about.content}")
    public String aboutContent;

    @Getter
    @Value("${text.links.title}")
    public String linksTitle;

    @Getter
    @Value("${text.header.text}")
    public String headerText;

    // LINKS TEXT
    @Getter
    @Value("${text.links.source}")
    public String linksSource;

    @Getter
    @Value("${text.links.locationAPI}")
    public String linksLocationAPI;

    @Getter
    @Value("${text.links.weatherAPI}")
    public String linksWeatherAPI;

    @Getter
    @Value("${text.links.twitter4J}")
    public String linksTwitter4J;

    @Getter
    @Value("${text.links.twitterAccount}")
    public String twitterAccount;

    // LINKS URLS
    @Getter
    @Value("${text.links.sourceURL}")
    public String linksSourceURL;

    @Getter
    @Value("${text.links.locationAPIURL}")
    public String linksLocationAPIURL;

    @Getter
    @Value("${text.links.weatherAPIURL}")
    public String linksWeatherAPIURL;

    @Getter
    @Value("${text.links.twitter4JURL}")
    public String linksTwitter4JURL;

    @Getter
    @Value("${text.links.twitterAccountURL}")
    public String twitterAccountURL;

}
