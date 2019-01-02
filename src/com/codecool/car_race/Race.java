package com.codecool.car_race;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Race {

    List<Truck> trucks = new ArrayList<>();
    List<Car> cars = new ArrayList<>();
    List<Motorcycle> motorcycles = new ArrayList<>();
    boolean isRaining;

    // simulates the race by
    // - calling moveForAnHour() on every vehicle 50 times
    // - setting whether its raining
    protected void simulateRace() {
        for (int i = 0; i < 50; i++) {
            Weather weather = new Weather();
            isRaining = weather.isRaining();
            for (Truck truck : trucks) {
                truck.moveForAnHour(this);
            }
            for (Car car : cars) {
                car.moveForAnHour(this);
            }
            for (Motorcycle motorcycle : motorcycles) {
                motorcycle.moveForAnHour(this);
            }

        }
    }

    // prints each vehicle's name, distance traveled ant type.
    protected void printRaceResults(){
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.addAll(cars);
        vehicles.addAll(motorcycles);
        vehicles.addAll(trucks);
        vehicles.sort(Comparator.comparing(Vehicle::getDistanceTraveled).reversed());
        for (Vehicle vehicle: vehicles) {
            System.out.println("Name: " + vehicle.getName() + ", Distance traveled: " + vehicle.distanceTraveled + ", Type: " + vehicle.getClass().toString().replace("class com.codecool.car_race.", ""));
        }
    }

    // returns true if there is a broken truck on track
    boolean isThereABrokenTruck(List<Truck> trucks){
        for (Truck truck: trucks) {
            if (truck.breakdownTurnsLeft > 0)
                return true;
        }
        return false;
    }
}
