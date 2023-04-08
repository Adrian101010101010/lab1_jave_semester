package ua.lviv.iot.algo.part1.lab1;

import static org.junit.jupiter.api.Assertions.*;

class AerialVehicleManagerTest {

    @org.junit.jupiter.api.Test
    void addAerialVehicle() {
        Drone drone = new Drone("Im", 10);
        Helicopter helicopter = new Helicopter(2, "srt");
        Plane plane = new Plane("Boeing - 777", 350);
        MilitaryDrone militaryDrone = new MilitaryDrone("Northrop crumman X-47B", 3889);

        assertEquals(drone, AerialVehicleManager.addAerialVehicle(drone));
        assertEquals(helicopter, AerialVehicleManager.addAerialVehicle(helicopter));
        assertEquals(plane, AerialVehicleManager.addAerialVehicle(plane));
        assertEquals(militaryDrone, AerialVehicleManager.addAerialVehicle(militaryDrone));
    }

    @org.junit.jupiter.api.Test
    void AerialVehicleMethods() {
        Drone drone = new Drone("Im", 10);
        Helicopter helicopter = new Helicopter(2, "srt");
        Plane plane = new Plane("Boeing - 777", 350);
        MilitaryDrone militaryDrone = new MilitaryDrone("Northrop crumman X-47B", 3889);

        AerialVehicleManager.addAerialVehicle(drone);
        AerialVehicleManager.addAerialVehicle(helicopter);
        AerialVehicleManager.addAerialVehicle(plane);
        AerialVehicleManager.addAerialVehicle(militaryDrone);
    }

    @org.junit.jupiter.api.Test
    void testFilterFlyingDistance() {
        Drone drone1 = new Drone("Im1", 10);
        Drone drone2 = new Drone("Im2", 20);
        Helicopter helicopter1 = new Helicopter(2, "srt1");
        Helicopter helicopter2 = new Helicopter(5, "srt2");
        Plane plane1 = new Plane("Boeing - 747", 1000);
        Plane plane2 = new Plane("Boeing - 777", 3000);
        MilitaryDrone militaryDrone1 = new MilitaryDrone("MQ-9 Reaper", 2000);
        MilitaryDrone militaryDrone2 = new MilitaryDrone("North",1000);

        AerialVehicleManager.addAerialVehicle(drone1);
        AerialVehicleManager.addAerialVehicle(drone2);
        AerialVehicleManager.addAerialVehicle(helicopter1);
        AerialVehicleManager.addAerialVehicle(helicopter2);
        AerialVehicleManager.addAerialVehicle(plane1);
        AerialVehicleManager.addAerialVehicle(plane2);
        AerialVehicleManager.addAerialVehicle(militaryDrone1);
        AerialVehicleManager.addAerialVehicle(militaryDrone2);
    }
}