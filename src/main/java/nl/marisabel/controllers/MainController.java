package nl.marisabel.controllers;

import nl.marisabel.dto.FormDTO;
import nl.marisabel.dto.WebTextDTO;
import nl.marisabel.services.location.LocationService;
import nl.marisabel.services.twitter.TwitterService;
import nl.marisabel.services.weather.WeatherService;
import nl.marisabel.services.twitter.TwitterAPI;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import twitter4j.TwitterException;


import javax.validation.Valid;
import java.io.IOException;

//TODO manage to put javascript on resources file
//TODO call the properties files correctly and not direct path

@Controller
@ComponentScan(basePackages = "nl.marisabel")
@SessionAttributes({"aboutTitle", "aboutContent", "headerText","headerTitle", "weather", "location" })
public class MainController {

    private final WebTextDTO webText;
    private final WeatherService weather;
    private final LocationService location;
    private final TwitterService twitter;

    public MainController(WebTextDTO webText, WeatherService weather, LocationService location, TwitterService twitter) {
        this.webText = webText;
        this.weather = weather;
        this.location = location;
        this.twitter = twitter;
    }

    @RequestMapping(value = "/home", method= RequestMethod.GET)
    public ModelAndView main(Model model) throws IOException, InterruptedException, TwitterException {
        model.addAttribute("aboutTitle", webText.getAboutTitle());
        model.addAttribute("aboutContent", webText.getAboutContent());
        model.addAttribute("headerText", webText.getHeaderText());
        model.addAttribute("headerTitle", webText.getHeaderTitle());
        model.addAttribute("weather", (weather.sendWeatherToView()));
        model.addAttribute("location", location.getCityCountry());
        return new ModelAndView("home", "tweet", new FormDTO()) ;
    }

    @RequestMapping(value = "/addTweet", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("tweet") FormDTO formDTO,
                         BindingResult result,
                         Model model) throws IOException, TwitterException {

        if (result.hasErrors()) {
            return "home";
        }
        twitter.createTweet(formDTO.getTweet());
        model.addAttribute("confirmedTweet", "You tweeted: " + formDTO.getTweet());
        model.addAttribute("confirmation", "Your tweet has been sent!");
        return "home";
    }


    @RequestMapping(value = "/addAutoTweet", method = RequestMethod.POST)
    public String submitAuto(@ModelAttribute("tweet") FormDTO journal, Model model) throws IOException, TwitterException, InterruptedException {

        String condition = weather.sendWeatherToView();
        String message = "Hello! This is my twitter webapp! I am practicing Spring and API. Today is "+ condition;
        twitter.createTweet(message);
        model.addAttribute("confirmation", "Your tweet has been sent!");
        model.addAttribute("confirmedTweet", "You tweeted: " + message);
        return "home";
    }




}
