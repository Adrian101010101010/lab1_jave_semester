package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;


public class AerialVehicleManager {
    private static final List<AerialVehicle> list = new LinkedList<>();

    public static AerialVehicle addAerialVehicle(final AerialVehicle aerialVehicle ){
        list.add(aerialVehicle);
        return aerialVehicle;
    }

    public static void main(String[] args){
        Drone drone = new Drone("Im",10);
        Helicopter helicopter = new  Helicopter(2,"srt");
        Plane plane = new Plane("Boeing - 777",350);
        MilitaryDrone militaryDrone = new MilitaryDrone("Northrop crumman X-47B",3889);

        addAerialVehicle(helicopter);
        addAerialVehicle(drone);
        addAerialVehicle(plane);
        addAerialVehicle(militaryDrone);

       for (AerialVehicle element : list) {
            System.out.println(element.toString());
        }

        for (AerialVehicle element : list) {
            System.out.println(helicopter.takeOff()
                    .ascend(20)
                    .descend(10)
                    .refuel(100)
                    .accelerateHelicopter(20));
            System.out.println(drone.fast(50));
            System.out.println(plane.fast(60));
            System.out.println(militaryDrone.PPOSee(100));
        }

        System.out.println(" ");
        list.stream()
                .filter(a -> a.flyingDistance()> 2000)
                .forEach(System.out::println);

        System.out.println(" ");
        list.stream()
                .filter(a -> a.feliveryWeight()<1000 )
                .forEach(System.out::println);
    }
}
