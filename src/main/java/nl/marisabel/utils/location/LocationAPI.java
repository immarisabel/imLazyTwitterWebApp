package nl.marisabel.utils.location;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import org.springframework.stereotype.Service;

import javax.annotation.processing.Generated;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class LocationAPI {

    public String location() throws IOException, InterruptedException, JsonSyntaxException, MalformedJsonException {

        HttpResponse<String> response = null;
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://ip-geo-location.p.rapidapi.com/ip/check?format=json"))
                    .header("x-rapidapi-key", "e0c5062070msh5a3786f34a7a33bp1afa72jsn38607315c044")
                    .header("x-rapidapi-host", "ip-geo-location.p.rapidapi.com")
                    .method("GET", HttpRequest.BodyPublishers.noBody()).build();
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return response.body();
    }

}