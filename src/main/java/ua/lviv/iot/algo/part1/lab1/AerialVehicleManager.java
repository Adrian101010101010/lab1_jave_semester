package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;



        AERIAL_VEHICLE_LIST.add(aerialVehicle);
    }

    /**
     * Void.
     *
     * @param args void main
     */
    public static void main(final String[] args) {
        final Drone drone = new Drone(100000, "Im", 10);
        final Helicopter helicopter = new Helicopter(2, "srt");
        final Plane plane = new Plane("Boeing - 777", 350);
        final MilitaryDrone militaryDrone =
                new MilitaryDrone("Northrop crumman X-47B", 3889);




        for (final AerialVehicle element : AERIAL_VEHICLE_LIST) {
            System.out.println(element.toString());
        }

        final int helicopterAscendHeight = 20;
        final int helicopterDescendHeight = 10;
        final int helicopterRefuelAmount = 100;
        final int helicopterAcceleration = 20;
        final int droneSpeed = 50;
        final int planeSpeed = 60;
        final int militaryDronePposeeDistance = 100;

        for (final AerialVehicle element : AERIAL_VEHICLE_LIST) {
            System.out.println(helicopter.takeOff()
                    .ascend(helicopterAscendHeight)
                    .descend(helicopterDescendHeight)
                    .refuel(helicopterRefuelAmount)
                    .accelerateHelicopter(helicopterAcceleration));
            System.out.println(drone.fast(droneSpeed));
            System.out.println(militaryDrone
                    .ppoSee(militaryDronePposeeDistance));
            System.out.println(element.toString());
        }

        final int minDeliveryWeight = 2000;
        final int maxDeliveryWeight = 1000;

        System.out.println(" ");
        AERIAL_VEHICLE_LIST
                .stream().filter(a -> a.getFeliveryWeight() > minDeliveryWeight)
                .forEach(System.out::println);

        System.out.println(" ");
        AERIAL_VEHICLE_LIST
                .stream().filter(a -> a.getFeliveryWeight() < maxDeliveryWeight)
                .forEach(System.out::println);
    }
}
