package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@ToString
public  class Drone extends AerialVehicle{
    private int batteryCapacity;
    private int chargeConsumptionPerMinuteOfFlight;
    private int speed;
    private  String manufacturer;

    public Drone(String manufacturer,int chargeConsumptionPerMinuteOfFlight){
        this.manufacturer = manufacturer;
        this.chargeConsumptionPerMinuteOfFlight = chargeConsumptionPerMinuteOfFlight;
    }
    public Drone(){}

    private final static Drone defaultDrone = new Drone();

     public  Drone fast(int acceleration){
        int newSpeed;
        int maxSpeed = getMaxSpeed();
        newSpeed = speed + acceleration;
        if (newSpeed > maxSpeed){
            newSpeed = maxSpeed;
        }
        if (batteryCapacity == 50) maxSpeed = maxSpeed / 2;
        if (batteryCapacity ==0){
            maxSpeed =0;
        }
        return defaultDrone;
    }


}
