package nl.marisabel.services;

import com.google.gson.Gson;
import nl.marisabel.utils.locationPOJO.LocationMain;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GetLocation {


    public String json() throws IOException, InterruptedException {
        LocationAPI api = new LocationAPI();
        return api.location();
    }

    public Double getLatitude(String jsonString) throws IOException, InterruptedException {
        Gson gson = new Gson();
        LocationMain locationMain = gson.fromJson(jsonString, LocationMain.class);
        double lat = locationMain.getLocation().getLatitude();
        return (lat);
    }

    public Double getLongitude(String jsonString) throws IOException, InterruptedException {
        Gson gson = new Gson();
        LocationMain locationMain = gson.fromJson(jsonString, LocationMain.class);
        double lon = locationMain.getLocation().getLongitude();
        return (lon);
    }

    public String getCityCountry(String jsonString){
        Gson gson = new Gson();
        LocationMain locationMain= gson.fromJson(jsonString, LocationMain.class);
        String city = locationMain.getCity().getName();
        String country = locationMain.getCountry().getName();
        System.out.println(city + ", " + country);
        return (city + ", " + country);
    }

}

