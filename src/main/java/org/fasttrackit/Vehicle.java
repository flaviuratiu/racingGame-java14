package org.fasttrackit;

public class Vehicle {

    // instance variables
    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double traveledDistance;
    boolean running;

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + " is accelerating with "
                + speed + " for " + durationInHours + "h.");

        // local variable (declared inside a method)
        double distance = speed * durationInHours;

        traveledDistance = traveledDistance + distance;
        // same result as the statement above
//        traveledDistance += distance;

        System.out.println("Total traveled distance: " + traveledDistance);

        double usedFuel = distance * mileage / 100;

        System.out.println("Used fuel: " + usedFuel);

        fuelLevel -= usedFuel;

        System.out.println("Remaining fuel level: " + fuelLevel);

        return distance;
    }

}
