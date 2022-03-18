package nl.marisabel.services.weather;

import nl.marisabel.services.LoadApiKeysPropertiesFile;
import nl.marisabel.services.location.LocationService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class WeatherAPI {

    public String weather(double lat, double lon) throws IOException, InterruptedException {

        LoadApiKeysPropertiesFile apiKeys = new LoadApiKeysPropertiesFile();
        String uriString1 = "https://api.weatherapi.com/v1/current.json?key=";
        String key = apiKeys.weatherApiKey();
        String uriString2 = "&q=";
        String uriString3 = "&aqi=no";

        String apiUrl = uriString1 + key + uriString2 + lat + "," + lon + uriString3;

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiUrl))
                .method("GET", HttpRequest.BodyPublishers.noBody()).build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
