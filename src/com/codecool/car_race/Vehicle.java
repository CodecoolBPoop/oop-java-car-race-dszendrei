package com.codecool.car_race;

public class Vehicle {
    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    // holds the summarized distance traveled in the race.
    int distanceTraveled = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    }

