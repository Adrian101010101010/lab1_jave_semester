package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DroneTest {

    @Test
    void fast() {
        Drone drone = new Drone();
        drone.fast(200);
        int expectedSpeed = 0;
        int actualSpeed = drone.getMaxSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }
}