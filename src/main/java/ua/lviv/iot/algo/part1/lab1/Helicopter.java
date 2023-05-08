package ua.lviv.iot.algo.part1.lab1;

import lombok.*;


@Getter
@NoArgsConstructor


public class Helicopter extends AerialVehicle {
    private static final int id = 100;
    protected static final int maxAltitude = 1000;
  //  protected static final int fuelCapacity = 30;
    private int currentAltitude;
    private static final int currentFuel = 10;
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
        if (newAltitude == 3000) {
            System.out.println("maxAltitude = 3000");
        }
        else this.currentAltitude = newAltitude;
        return defaultHelicopter;
    }

    public Helicopter descend(int altitude) {
        if (altitude == 0) {
            System.out.println("Altitude = 0");
        }
        return defaultHelicopter;
    }

    public Helicopter refuel(int fuel) {
        int fuelUpdated = currentFuel + fuel;
        if (fuelUpdated == 100 ) {
            System.out.println("Fuel");
        }
        return defaultHelicopter;
    }
    public Helicopter accelerateHelicopter(int speed){
        int newSpeed;
        int maxSpeed = getMaxSpeed();
        newSpeed = speed;
        if (newSpeed>maxSpeed){
           System.out.println("maxSpeed = 300");
        }
        return defaultHelicopter;
    }
}