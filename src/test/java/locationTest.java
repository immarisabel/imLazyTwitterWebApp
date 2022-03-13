import com.google.gson.Gson;
import nl.marisabel.services.GetLocation;
import nl.marisabel.services.GetWeather;
import nl.marisabel.utils.location.Location;
import nl.marisabel.utils.location.LocationAPI;
import nl.marisabel.utils.location.LocationMain;
import nl.marisabel.utils.weather.Weather;
import nl.marisabel.utils.weather.WeatherAPI;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Type;

import static org.junit.Assert.*;

public class locationTest {


    @Test
    public void testLocationAPINotNull() throws IOException, InterruptedException {
        GetLocation location = new GetLocation();
        assertNotNull(location.json());
    }

    @Test
    public void testLocationInfo() throws IOException, InterruptedException {
        String json = "{\"ip\":\"84.87.169.129\",\"type\":\"IPv4\",\"location\":{\"latitude\":51.9486,\"longitude\":4.5588},\"postcode\":\"3067\",\"area\":{\"code\":\"NL-ZH\",\"geonameid\":2743698,\"name\":\"South Holland\"},\"asn\":{\"number\":1136,\"organisation\":\"KPN B.V.\"},\"city\":{\"geonameid\":2747891,\"name\":\"Rotterdam\",\"population\":598199},\"continent\":{\"geonameid\":6255148,\"name\":\"Europe\",\"code\":\"EU\"},\"country\":{\"geonameid\":2750405,\"name\":\"Netherlands\",\"code\":\"NL\",\"capital\":\"Amsterdam\",\"area_size\":\"41526.00 sq. km\",\"population\":17231017,\"phone_code\":\"31\",\"is_in_eu\":true,\"languages\":{\"nl\":\"Dutch language\",\"fy\":\"West Frisian language\"},\"flag\":{\"file\":\"https://commons.wikimedia.org/wiki/Special:FilePath/Flag_of_the_Netherlands.svg\",\"emoji\":\"\uD83C\uDDF3\uD83C\uDDF1\",\"unicode\":\"U+1F1F3 U+1F1F1\"},\"tld\":\".nl\"},\"currency\":{\"code\":\"EUR\",\"name\":\"Euro\"},\"security\":{\"is_tor\":false,\"is_proxy\":false,\"is_crawler\":false,\"is_threat\":false,\"is_thread\":false},\"time\":{\"timezone\":\"Europe/Amsterdam\",\"gtm_offset\":3600,\"gmt_offset\":3600,\"is_daylight_saving\":false,\"code\":\"CET\"},\"status\":\"success\"}\n";
        Gson gson = new Gson();
        LocationMain locationMain = gson.fromJson(json, LocationMain.class);
        String countryName = locationMain.getCountry().getName();
        double lat = locationMain.getLocation().getLatitude();
        System.out.println(lat);
        System.out.println(countryName);
    }

    @Test
    public void testWeatherInfo() throws IOException, InterruptedException {
        Gson gson = new Gson();

        String json = "{\"ip\":\"84.87.169.129\",\"type\":\"IPv4\",\"location\":{\"latitude\":51.9486,\"longitude\":4.5588},\"postcode\":\"3067\",\"area\":{\"code\":\"NL-ZH\",\"geonameid\":2743698,\"name\":\"South Holland\"},\"asn\":{\"number\":1136,\"organisation\":\"KPN B.V.\"},\"city\":{\"geonameid\":2747891,\"name\":\"Rotterdam\",\"population\":598199},\"continent\":{\"geonameid\":6255148,\"name\":\"Europe\",\"code\":\"EU\"},\"country\":{\"geonameid\":2750405,\"name\":\"Netherlands\",\"code\":\"NL\",\"capital\":\"Amsterdam\",\"area_size\":\"41526.00 sq. km\",\"population\":17231017,\"phone_code\":\"31\",\"is_in_eu\":true,\"languages\":{\"nl\":\"Dutch language\",\"fy\":\"West Frisian language\"},\"flag\":{\"file\":\"https://commons.wikimedia.org/wiki/Special:FilePath/Flag_of_the_Netherlands.svg\",\"emoji\":\"\uD83C\uDDF3\uD83C\uDDF1\",\"unicode\":\"U+1F1F3 U+1F1F1\"},\"tld\":\".nl\"},\"currency\":{\"code\":\"EUR\",\"name\":\"Euro\"},\"security\":{\"is_tor\":false,\"is_proxy\":false,\"is_crawler\":false,\"is_threat\":false,\"is_thread\":false},\"time\":{\"timezone\":\"Europe/Amsterdam\",\"gtm_offset\":3600,\"gmt_offset\":3600,\"is_daylight_saving\":false,\"code\":\"CET\"},\"status\":\"success\"}\n";
        LocationMain locationMain = gson.fromJson(json, LocationMain.class);
        double lat = locationMain.getLocation().getLatitude();
        double lon = locationMain.getLocation().getLongitude();
        System.out.println(lat+","+lon);

        WeatherAPI weatherAPI = new WeatherAPI();
        String jsonWeather = "{\"location\":{\"name\":\"Prins Alexanderpolder\",\"region\":\"South Holland\",\"country\":\"Netherlands\",\"lat\":51.95,\"lon\":4.56,\"tz_id\":\"Europe/Amsterdam\",\"localtime_epoch\":1646055703,\"localtime\":\"2022-02-28 14:41\"},\"current\":{\"temp_c\":10.0,\"temp_f\":50.0,\"condition\":{\"text\":\"Sunny\"},\"feelslike_c\":7.6,\"feelslike_f\":45.6,\"uv\":3.0}}\n";
        Weather weather = gson.fromJson(jsonWeather, Weather.class);
        String status = weather.getCurrent().getCondition().getText();
        System.out.println(status.toLowerCase());
    }

    @Test
    public void testLocationAPI() throws IOException, InterruptedException {
        LocationAPI loc = new LocationAPI();
        System.out.println(loc.location());
    }

    @Test
    public void testWeatherAPI() throws IOException, InterruptedException {
        WeatherAPI weather = new WeatherAPI();
        System.out.println(weather.weather(51.9486,4.5588));
    }
}
