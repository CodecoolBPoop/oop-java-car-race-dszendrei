package com.codecool.car_race;

public class Weather {
    // 30% chance of rain.
    private int setRaining = (int) (Math.random()*10);

    // is it raining currently.
    public boolean isRaining() {
        if (setRaining < 3) {
            return true;
        }
        return false;
    }


}
