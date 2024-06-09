/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weatherappmaven;

public class Coord {
    private int lon;
    private int lat;
//    public Coord(int lon, int lat)
//    {
//        this.lat = lat;
//        this.lon = lon;
//    }
    
    public void setLon(int lon)
    {
        this.lon = lon;
    }
    public void setLat(int lat)
    {
        this.lat = lat;
    }
    public int getLon()
    {
        return lon;
    }
    public int getLat()
    {
        return lat;
    }
       
}
