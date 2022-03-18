package nl.marisabel.services.location;

import com.google.gson.Gson;
import nl.marisabel.services.location.locationJsonDTO.LocationMain;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class LocationService {

    private String getJson() throws IOException, InterruptedException {
        LocationAPI locationAPI = new LocationAPI();
        return locationAPI.location();
    }

    public Double getLatitude(String jsonString) throws IOException, InterruptedException {
        Gson gson = new Gson();
        LocationMain locationMain = gson.fromJson(getJson(), LocationMain.class);
        double lat = locationMain.getLocation().getLatitude();
        return (lat);
    }

    public Double getLongitude(String jsonString) throws IOException, InterruptedException {
        Gson gson = new Gson();
        LocationMain locationMain = gson.fromJson(getJson(), LocationMain.class);
        double lon = locationMain.getLocation().getLongitude();
        return (lon);
    }

    public String getCityCountry() throws IOException, InterruptedException {
        Gson gson = new Gson();
        LocationMain locationMain= gson.fromJson(getJson(), LocationMain.class);
        String city = locationMain.getCity().getName();
        String country = locationMain.getCountry().getName();
        System.out.println("from service: " + getJson());
        return (city + ", " + country);
    }


}

