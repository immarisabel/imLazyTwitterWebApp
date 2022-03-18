import com.google.gson.Gson;
import nl.marisabel.services.location.LocationAPI;
import nl.marisabel.services.location.LocationService;
import nl.marisabel.services.weather.WeatherService;
import nl.marisabel.services.weather.weatherJsonDTO.Weather;
import nl.marisabel.services.weather.WeatherAPI;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
@DisplayName("Testing Weather Service")
public class weatherTest {

    // Using location Rotterdam, Netherlands
    public Double lat = 51.9486;
    public Double lon = 4.5588;

    @Test
    @DisplayName("Does the call return a Json string?")
    public void testWeatherAPI() throws IOException, InterruptedException {
        WeatherAPI weather = new WeatherAPI();
        assertNotNull(weather);
        System.out.println(weather.weather(lat, lon));
    }

    @Test
    @DisplayName("Am I able to retrieve weather condition from Json string?")
    public void testLocationResult() throws IOException, InterruptedException {
        WeatherService service = new WeatherService();
        String weather = service.weather(lat, lon);
        assertNotNull(weather);
        System.out.println(weather);
    }


}
