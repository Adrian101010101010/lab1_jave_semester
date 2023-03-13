package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Helicopter {
    private final int id = 100;
    private final int maxAltitude = 1000;
    private final int fuelCapacity = 30;
    private String model;
    private int currentAltitude;
    private int currentFuel = 10;

    private static final Helicopter defaultHelicopter = new Helicopter();

    public static Helicopter getInstance() {
        return defaultHelicopter;
    }

    public Helicopter takeOff() {
        this.currentAltitude = 100;
        return defaultHelicopter;
    }

    public Helicopter ascend(int altitude) {
        int newAltitude = this.currentAltitude + altitude;
        if (newAltitude > maxAltitude) {
            this.currentAltitude = maxAltitude;
        } else this.currentAltitude = newAltitude;
        return defaultHelicopter;
    }

    public Helicopter descend(int altitude) {
        int newAltitude = this.currentAltitude - altitude;
        if (newAltitude < 0) {
            this.currentAltitude = 0;
        } else this.currentAltitude = newAltitude;
        return defaultHelicopter;
    }

    public void refuel(int fuel) {
        int fuelUpdated = this.currentFuel + fuel;
        if (fuelUpdated > this.fuelCapacity) {
            this.currentFuel = this.fuelCapacity;
        } else this.currentFuel = fuelUpdated;
    }

    public static void main(String... args) {
        Helicopter helicopter = new Helicopter();
        helicopter.takeOff().ascend(20).descend(10).refuel(100);
        Helicopter helicopter1 = getInstance();
        helicopter1.takeOff();
    }

}