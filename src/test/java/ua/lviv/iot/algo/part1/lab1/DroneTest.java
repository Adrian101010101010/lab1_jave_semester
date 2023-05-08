package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DroneTest {

    @Test

    void testFast() {
        Drone drone = new Drone(1999,"Test manufacturer", 100);
        drone.fast(200);
        int expectedSpeed = 0;
        int actualSpeed = drone.getMaxSpeed();
        assertEquals(expectedSpeed, actualSpeed);
