package com.company;

import java.util.ArrayList;

public class City {

    String name;
    ArrayList<Restaurant> restaurants;

    public City(String name, ArrayList<Restaurant> restaurants) {
        this.name = name;
        this.restaurants = restaurants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}
