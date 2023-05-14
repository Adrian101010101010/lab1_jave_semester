package com.example.lab6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DroneTest {

    @Test
    void testFast() {
        Drone drone = new Drone(1999,"Test manufacturer", 100);
        drone.fast(200);
        int expectedSpeed = 0;
        int actualSpeed = drone.getMaxSpeed();
        assertEquals(expectedSpeed, actualSpeed);

        drone.fast(50);
        int expectedSpeed1 = 0;
        int actualSpeed1 = drone.getMaxSpeed();
        assertEquals(expectedSpeed1, actualSpeed1);

        drone.fast(0);
        int expectedSpeed2 = 0;
        int actualSpeed2 = drone.getMaxSpeed();
        assertEquals(expectedSpeed2, actualSpeed2);
    }
}