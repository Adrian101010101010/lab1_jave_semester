package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Helicopter {

    private final int id=100;
    private  String model;
    private int currentAltitude;
    private final int maxAltitude=1000;
    private final int fuelCapacity = 30;
    private int currentFuel = 10;


private static final Helicopter defaultHelicopter =new Helicopter();

public Helicopter(){}

    public static Helicopter getInstance(){
    return defaultHelicopter;
    };
    public String toString(){
    return "Helicopter{"
            + "id"+id+"model"+model+'}';
    }
    public Helicopter takeOff(){
        this.currentAltitude=100;
        System.out.println("Current altitude is ");
        System.out.println(this.currentAltitude);
        return defaultHelicopter;
    }
    public Helicopter ascend(int altitude){

        int newAltitude= this.currentAltitude+altitude;
        if (newAltitude>maxAltitude){
            this.currentAltitude = maxAltitude;
        }
       else this.currentAltitude = newAltitude;
        System.out.println("Ascended to altitude ");
        System.out.println(this.currentAltitude);
        return defaultHelicopter;
    }
    public Helicopter descend(int altitude){
        int newAltitude = this.currentAltitude - altitude;
        if(newAltitude < 0) {
            this.currentAltitude = 0;
        } else this.currentAltitude = newAltitude;
        System.out.println("Descended to altitude ");
        System.out.println(this.currentAltitude);
        return defaultHelicopter;
    }
    public Helicopter refuel(int fuel){
        int fuelUpdated = this.currentFuel + fuel;
        if (fuelUpdated> this.fuelCapacity) {
            System.out.println("The tank is full");
            this.currentFuel = this.fuelCapacity;
        } else this.currentFuel = fuelUpdated;
        return defaultHelicopter;
    }
    public static void main(String ... args){
        Helicopter helicopter = new Helicopter();
        System.out.println(helicopter);
        helicopter.takeOff();
        helicopter.ascend(20);
        helicopter.descend(10);
        helicopter.refuel(100);
    }
}