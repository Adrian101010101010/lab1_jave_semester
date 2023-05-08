package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;



public class AerialVehicleManager {
    private static final List<AerialVehicle> list = new LinkedList<>();

    public static AerialVehicle addAerialVehicle(final AerialVehicle aerialVehicle) {



    public static void main(String[] args) {
        Drone drone = new Drone(100000, "Im", 10);
        Helicopter helicopter = new Helicopter(2, "srt");
        Plane plane = new Plane("Boeing - 777", 350);
        MilitaryDrone militaryDrone = new MilitaryDrone("Northrop crumman X-47B", 3889);


        for (AerialVehicle element : list) {


            System.out.println(helicopter.takeOff().ascend(20).descend(10).refuel(100).accelerateHelicopter(20));



       
        list.stream().filter(a -> a.getFeliveryWeight() > 2000).forEach(System.out::println);

        System.out.println(" ");
        list.stream().filter(a -> a.getFeliveryWeight() < 1000).forEach(System.out::println);
    }
}
