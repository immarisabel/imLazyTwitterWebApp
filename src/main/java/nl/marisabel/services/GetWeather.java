package nl.marisabel.services;


import com.google.gson.Gson;
import nl.marisabel.utils.weather.Weather;
import nl.marisabel.utils.weather.WeatherAPI;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GetWeather {

    private Weather weather;

    public String json(double lat, double lon) throws IOException, InterruptedException {
            Gson gson = new Gson();
            WeatherAPI weather = new WeatherAPI();
            String json = weather.weather(lat,lon);
            return (json);
    }

    public String weather(double lat, double lon) throws IOException, InterruptedException {
            Gson gson= new Gson();
            Weather weatherService = gson.fromJson(json(lat,lon), Weather.class);
            String condition = weatherService.getCurrent().getCondition().getText();
            return condition;
    }

}