package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;

@ToString
public class Plane extends AerialVehicle{
    private  String manufacturer;
    private int speedNow;

    public   Plane (String manufacturer, int speedNow){
        this.manufacturer = manufacturer;
        this.speedNow = speedNow;
    }

    public Plane(){}

    private final static Plane defaultPlane = new Plane();

    public  Plane fast(int acceleration){
        int newSpeed;
        int maxSpeed = getMaxSpeed();
        newSpeed = speedNow + acceleration;
        if (maxSpeed == 568){
            System.out.println("maxSpeed = 568");
        }
        if (newSpeed == 360){
            System.out.println("newSpeed = 360");
        }
        return defaultPlane;
    }


}
