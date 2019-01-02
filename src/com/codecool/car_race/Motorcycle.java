package com.codecool.car_race;

public class Motorcycle extends Vehicle {

    public Motorcycle () {
    }

    // The number of the instance created. Used for its name.
    // Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.
    public Motorcycle (int motorcycleNumber) {
        String name = "Motorcycle " + motorcycleNumber;
        setName(name);
    }

    // speed is 100km/h. If it rains, travels with 5-50km/h slower (randomly). Doesn't care about trucks.
    private int speed;
    private int normalSpeed = 100;

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    // setup the actual speed used for the current lap
    private void prepareForLap(Race race) {
        if (race.isRaining) {
            speed = (int) (Math.random()*45) + 5;
        } else {
            speed = normalSpeed;
        }
    }

    // The vehicle travels for an hour. It increases the distance traveled. Call this from the Race::simulateRace() only!
    protected void moveForAnHour(Race race) {
        prepareForLap(race);
        distanceTraveled += speed;
    }

}
