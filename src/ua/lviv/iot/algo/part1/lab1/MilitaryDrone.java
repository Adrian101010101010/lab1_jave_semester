package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;

@ToString

public class MilitaryDrone extends AerialVehicle{

    private int flightRange;

    public MilitaryDrone(String manufacturer,int flightRange){
        this.manufacturer = manufacturer;
        this.flightRange = flightRange;
    }

    public MilitaryDrone(){}

    private final static MilitaryDrone defaultMilitaryDrone = new MilitaryDrone();

    public MilitaryDrone PPOSee ( int percentageOfInvisibility){
        if (percentageOfInvisibility == 100){
            System.out.println("дрон переміг");
        }
        if (percentageOfInvisibility == 50){
            System.out.println("дрон нічия");
        }
        if (percentageOfInvisibility == 0){
            System.out.println("дрон програш");
        }
        return defaultMilitaryDrone;
    }

}
