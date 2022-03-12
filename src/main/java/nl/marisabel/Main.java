package nl.marisabel;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.simple.JSONObject;
import twitter4j.TwitterException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws TwitterException, IOException, InterruptedException {
        System.out.println(getTweets());

    }


    public static String getTweets() throws IOException, InterruptedException, JsonSyntaxException, MalformedJsonException {

        String path = "C:\\Users\\Administrator\\Documents\\Programming\\PROJECTS\\imLazyApp\\src\\main\\resources\\twitter4j.properties";
        String apikeys = path;
        Properties properties = new Properties();
        properties.load(new FileInputStream(apikeys));

        final String authString = properties.getProperty("oauth.postman");

        OkHttpClient client = new OkHttpClient().newBuilder().build();
        Request request = new Request.Builder()
                .url("https://api.twitter.com/2/users/840141392844275712/tweets")
                .method("GET", null)
                .addHeader("Authorization", authString)
                .build();
        Response response = client.newCall(request).execute();

        return response.body().string();

        }
    }


