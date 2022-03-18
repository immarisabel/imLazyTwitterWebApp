package nl.marisabel.services.location;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import nl.marisabel.services.LoadApiKeysPropertiesFile;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;

@Service
public class LocationAPI {


    public String location() throws IOException, InterruptedException, JsonSyntaxException, MalformedJsonException {

        LoadApiKeysPropertiesFile apiKeys = new LoadApiKeysPropertiesFile();
        HttpResponse<String> response = null;
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://ip-geo-location.p.rapidapi.com/ip/check?format=json"))
                    .header("x-rapidapi-key", apiKeys.locationApiKey())
                    .header("x-rapidapi-host", "ip-geo-location.p.rapidapi.com")
                    .method("GET", HttpRequest.BodyPublishers.noBody()).build();
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return response.body();
    }

}