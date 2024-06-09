package com.mycompany.weatherappmaven;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherAppmaven {

    //33d3a6b7eca5f39afa07efd027fe44d3 WeatherApp
    //https://api.openweathermap.org/data/2.5/weather?lat=-36.85&lon=174.76&appid=33d3a6b7eca5f39afa07efd027fe44d3&units=metric
    private static final String WEATHER_URL = "https://api.openweathermap.org/data/2.5/weather?lat=-36.85&lon=174.76&appid=33d3a6b7eca5f39afa07efd027fe44d3&units=metric";

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient httpc = HttpClient.newHttpClient();
        HttpRequest httpr = HttpRequest.newBuilder()
                .GET()
                .header("Accept", "json")
                .uri(URI.create(WEATHER_URL))
                .build();
        HttpResponse<String> response = httpc.send(httpr, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        String str = response.body();
        ObjectMapper om = new ObjectMapper();
        WeatherObj weatherobj = new WeatherObj();
        weatherobj = om.readValue(str, WeatherObj.class);
        System.out.println(weatherobj.getCoord().getLat());
        System.out.println(weatherobj.getCoord().getLon());
        Weather[] wth = weatherobj.getWeather();
        Weather firstWeather = wth[0];
        System.out.println(weatherobj.getMain().getTemp());
                        
        

    }

}
