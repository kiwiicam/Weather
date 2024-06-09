
package com.mycompany.weatherappmaven;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherObj {
    private MainWTH main;
    private Coord coord;
    private Weather[] weather;
    private String name;
    //private City name;
    public WeatherObj()
    {
        main = new MainWTH();
        coord = new Coord();   
    }
//    public City getName()
//    {
//        return name;
//    }
    public String getName()
    {
        return name;
    }
    public MainWTH getMain()
    {
        return main;
    }
    public Weather[] getWeather()
    {
        return weather;
    }
    public Coord getCoord()
    {
        return coord;
    }
   
    
}
