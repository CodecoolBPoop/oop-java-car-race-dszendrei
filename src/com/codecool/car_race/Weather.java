package com.codecool.car_race;

public class Weather {
    private int setRaining = (int) (Math.random()*10);
        // 30% chance of rain.

    public boolean isRaining() {
        // is it raining currently.
        if (setRaining < 3) {
            return true;
        }
        return false;
    }


}
