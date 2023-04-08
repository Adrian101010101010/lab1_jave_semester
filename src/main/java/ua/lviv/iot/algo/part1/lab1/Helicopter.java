package ua.lviv.iot.algo.part1.lab1;

import lombok.*;


@Getter
@NoArgsConstructor

@ToString
public class Helicopter extends AerialVehicle {
    private final int id = 100;
    private final int maxAltitude = 1000;
    private final int fuelCapacity = 30;
    private int currentAltitude;
    private int currentFuel = 10;
    private int mass;
    private String manufacturer;



    public Helicopter(int currentAltitude,String manufacturer){
       this.manufacturer = manufacturer;
        this.currentAltitude = currentAltitude;

    }

    private final static Helicopter defaultHelicopter = new Helicopter();


    public Helicopter takeOff() {
        this.currentAltitude = 100;
        return defaultHelicopter;
    }

    public Helicopter ascend(int altitude) {
        int newAltitude = this.currentAltitude + altitude;
        if (newAltitude > maxAltitude) this.currentAltitude = maxAltitude;
        else this.currentAltitude = newAltitude;
        return defaultHelicopter;
    }

    public Helicopter descend(int altitude) {
        int newAltitude = this.currentAltitude - altitude;
        if (newAltitude < 0) this.currentAltitude = 0;
        else this.currentAltitude = newAltitude;
        return defaultHelicopter;
    }

    public Helicopter refuel(int fuel) {
        int fuelUpdated = this.currentFuel + fuel;
        if (fuelUpdated > this.fuelCapacity) {
            this.currentFuel = this.fuelCapacity;
        }
        return defaultHelicopter;
    }
    public Helicopter accelerateHelicopter(int speed){
        int newSpeed;
        int maxSpeed = getMaxSpeed();
        newSpeed = speed;
        if (newSpeed>maxSpeed){
            newSpeed = maxSpeed;
            maxSpeed = 300;
        }
        return defaultHelicopter;
    }


}