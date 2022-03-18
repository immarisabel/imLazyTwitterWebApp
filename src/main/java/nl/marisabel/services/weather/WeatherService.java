package nl.marisabel.services.weather;

import com.google.gson.Gson;
import nl.marisabel.services.weather.weatherJsonDTO.Weather;
import nl.marisabel.services.location.LocationService;
import nl.marisabel.services.location.LocationAPI;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WeatherService {

    private LocationAPI locationAPI;
    private LocationService location;

    private String json(double lat, double lon) throws IOException, InterruptedException {
            Gson gson = new Gson();
            WeatherAPI weather = new WeatherAPI();
            String json = weather.weather(lat,lon);
            return (json);
    }

    public String weather(double lat, double lon) throws IOException, InterruptedException {
            Gson gson= new Gson();
            Weather weatherService = gson.fromJson(json(lat,lon), Weather.class);
            String condition = weatherService.getCurrent().getCondition().getText();
            Double temperatureC = weatherService.getCurrent().getTempC();

            String viewTemp = (condition + " & Temp. " + temperatureC +"C");
            return viewTemp;
    }

    public String sendWeatherToView() throws IOException, InterruptedException {
        String api = locationAPI.location();
        String condition = weather(location.getLatitude(api), location.getLongitude(api));
        return condition;
    }


}