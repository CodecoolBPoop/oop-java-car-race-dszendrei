package com.codecool.car_race;

public class Car extends Vehicle {

    Car () {
        String name = names[randNum1] + " " + names[randNum2];
        setName(name);
    }

    // If there is a broken down Truck on the track, then limit the max speed of cars to 75 km/h.
    private int speed;
    private int normalSpeed = (int) (Math.random()*30) + 80; // the normal speed of the car. Set to a random number in the constructor between 80-110km/h.

    private String[] names = new String[]{"Vigor", "Thunder", "Crusader", "Phenomenom", "Freedom", "Sliver", "Falcon", "Basilisk", "Crusader", "Inquiry"};
    private int randNum1 = (int) (Math.random()*10);
    private int randNum2 = (int) (Math.random()*10);



    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    // setup the actual speed used for the current lap
    protected void prepareForLap(Race race) {
        if(!race.isThereABrokenTruck(race.trucks)){
            speed = normalSpeed;
        } else {
            speed = 75;
        }
    }

    // The vehicle travels for an hour. It increases the distance traveled. Call this from the Race::simulateRace() only!
    protected void moveForAnHour(Race race) {
        prepareForLap(race);
        distanceTraveled += speed;
    }
}
