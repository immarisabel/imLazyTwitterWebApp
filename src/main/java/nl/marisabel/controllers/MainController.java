package nl.marisabel.controllers;

import nl.marisabel.dto.Form;
import nl.marisabel.dto.WebText;
import nl.marisabel.services.GetLocation;
import nl.marisabel.services.GetWeather;
import nl.marisabel.utils.location.LocationAPI;
import nl.marisabel.utils.twitter.TwitterAPI;
import org.springframework.beans.factory.annotation.Autowired;
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
//TODO clean up POJO location
//TODO "Hello world! Today is WEATHER in LOCATION and I feel MOOD." Button to send that instead of form.

@Controller
@ComponentScan(basePackages = "nl.marisabel")
@SessionAttributes({"aboutTitle", "aboutContent", "headerText","headerTitle", "weather", "location" })
public class MainController {

    @Autowired
    private WebText webText;
    @Autowired
    private GetLocation location;
    @Autowired
    private GetWeather weather;
    @Autowired
    private TwitterAPI twitter;


    @RequestMapping(value = "/home", method= RequestMethod.GET)
    public ModelAndView main(Model model) throws IOException, InterruptedException, TwitterException {
        model.addAttribute("aboutTitle", webText.getAboutTitle());
        model.addAttribute("aboutContent", webText.getAboutContent());
        model.addAttribute("headerText", webText.getHeaderText());
        model.addAttribute("headerTitle", webText.getHeaderTitle());

        // WEATHER

        GetWeather getWeather = new GetWeather();
        GetLocation loc = new GetLocation();
        LocationAPI locationAPI = new LocationAPI();
        String api = locationAPI.location();
        String condition = getWeather.weather(loc.getLatitude(api), loc.getLongitude(api)).toLowerCase();

        model.addAttribute("weather", (condition));
        model.addAttribute("location", loc.getCityCountry(api));

        return new ModelAndView("home", "journal", new Form()) ;

    }

    @RequestMapping(value = "/addEntry", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("journal") Form journal,
                         BindingResult result, Model model) throws IOException, TwitterException {
        if (result.hasErrors()) {
            return "home";
        }

        TwitterAPI twitter = new TwitterAPI();
        twitter.createTweet(journal.getEntry());
        model.addAttribute("confirmation", "Your tweet has been sent!");
        return "home";
    }





}
