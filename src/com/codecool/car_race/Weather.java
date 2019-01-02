package com.codecool.car_race;

class Weather {
    // 30% chance of rain.
    private int setRaining = (int) (Math.random()*10);

    // is it raining currently.
    boolean isRaining() {
        return setRaining < 3;
    }


}
