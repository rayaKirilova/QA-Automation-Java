package org.weatherApplication;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.List;

public class WeatherApi {
    // Doc for the API: https://open-meteo.com/
    // Example query:
    // https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m

    private String latitude;
    private String longitude;
    final Gson gson = new Gson();

    public WeatherApi(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void printHourlyTable() {
        URI getUri;
        try {
            getUri = new URI(Constants.BASE_API_URL + Constants.API_VERSION_ONE
                    + Constants.QUERY_DIVIDER
                    + Constants.LAT_PARAM_KEY + latitude
                    + Constants.REQ_DIVIDER
                    + Constants.LONG_PARAM_KEY + longitude
                    + Constants.REQ_DIVIDER
                    + Constants.HOURLY_KEY_VALUE
            );
        } catch (URISyntaxException e) {
            throw new RuntimeException();
        }

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(getUri)
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> httpResponse;

        try {
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        HourlyWeatherReport hourlyWeatherReport = gson.fromJson(httpResponse.body(), HourlyWeatherReport.class);
        HashMap<String, List<String>> resultsMap = hourlyWeatherReport.getHourly();

        // We can add condition to check of the resulting arrays have the same length
        // If not, BIG ERROR again
        if(resultsMap.containsKey(Constants.TIME_KEY) && resultsMap.containsKey(Constants.TEMP_KEY) ) {
            for(int i = 0; i < resultsMap.get(Constants.TIME_KEY).size(); i++) {
                System.out.println(
                        resultsMap.get(Constants.TIME_KEY).get(i)
                                + "| | | |" +
                                resultsMap.get(Constants.TEMP_KEY).get(i)
                );
            }
        } else {
            System.out.println(Constants.BIG_ERROR);
        }
    }
}