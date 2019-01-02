package com.codecool.car_race;

public class Truck extends Vehicle {
    // Truck drivers are boring. They call all their trucks a random number between 0 and 1000.
    Truck () {
        String name = String.valueOf((int) (Math.random()*1000));
        setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    // speed: 100km/h. 5% chance of breaking down for 2 turns.
    private int speed;

    // breakdownTurnsLeft holds how long its still broken down.
    protected int breakdownTurnsLeft = 0;

    // distanceTraveled holds the summarized distance traveled in the race.
    //distanceTraveled = 0;

    // setup the actual speed used for the current lap
    private void prepareForLap(Race race) {
        if (breakdownTurnsLeft < 1) {
            if ((int) (Math.random()*100) > 6) {
                speed = 100;
            } else {
                speed = 0;
                breakdownTurnsLeft = 2;
            }
        } else {
            breakdownTurnsLeft -= 1;
        }
    }

    // The vehicle travels for an hour. It increases the distance traveled. Call this from the Race::simulateRace() only!
    protected void moveForAnHour(Race race) {
        prepareForLap(race);
        distanceTraveled += speed;
    }
}
