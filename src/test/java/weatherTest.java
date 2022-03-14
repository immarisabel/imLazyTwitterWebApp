import com.google.gson.Gson;
import nl.marisabel.utils.weather.Weather;
import nl.marisabel.utils.weather.WeatherAPI;
import org.junit.Test;

import java.io.IOException;

public class weatherTest {

    @Test
    public void testCNotNull() throws IOException, InterruptedException {

        WeatherAPI api = new WeatherAPI();
        String json = api.weather(51.9486,4.5588);
        System.out.println(json);
        Gson gson= new Gson();
        Weather weatherService = gson.fromJson(json, Weather.class);
        System.out.println(weatherService.getCurrent().getTempC());
        System.out.println(weatherService.getCurrent().getCondition().getText());
        System.out.println(weatherService.getLocation().getCountry());
    }

    @Test
    public void getJson() throws IOException, InterruptedException {
        WeatherAPI api = new WeatherAPI();
        String json = api.weather(51.9486,4.5588);
        System.out.println(json);
    }

}
