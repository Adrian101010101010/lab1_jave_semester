package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;

@ToString
public class Plane extends AerialVehicle{

    private int speedNow;

    public   Plane (String manufacturer, int speedNow){
        this.manufacturer = manufacturer;
        this.speedNow = speedNow;
    }

    public Plane(){}

    private final static Plane defaultPlane = new Plane();

    public  Plane fast(int acceleration){
        int newSpeed;
        newSpeed = speedNow + acceleration;
        if (newSpeed > maxSpeed){
            newSpeed = maxSpeed;
            maxSpeed = 600;
        }
        return defaultPlane;
    }
}
