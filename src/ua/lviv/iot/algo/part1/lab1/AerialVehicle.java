package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@ToString

public abstract class AerialVehicle {
    public String manufacturer;
    public int maxSpeed;
    private int FlyingDistance;
    private int DeliveryWeight;

    public int getMaxFlyingDistance(){return FlyingDistance;}
    public int getMaxDeliveryWeight(){return DeliveryWeight; }
}
