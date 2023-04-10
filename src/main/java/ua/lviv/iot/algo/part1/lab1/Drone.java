package ua.lviv.iot.algo.part1.lab1;


import lombok.*;
@ToString
public  class Drone extends AerialVehicle{
    private int batteryCapacity;
    private int chargeConsumptionPerMinuteOfFlight;
    private int speed;
    private  String manufacturer;

    public Drone(int batteryCapacity, String manufacturer, int chargeConsumptionPerMinuteOfFlight){
        this.batteryCapacity = batteryCapacity;
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
            speed = 300;
        }
        if (batteryCapacity == 50){
            System.out.println("speed = 150");
        }
        if (batteryCapacity ==0){
            System.out.println("speed = 0");
        }
        return defaultDrone;
    }


}
