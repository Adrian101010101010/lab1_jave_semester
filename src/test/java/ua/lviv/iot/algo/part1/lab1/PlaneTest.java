package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @Test
    void fast() {
        Plane plane = new Plane();
        plane.fast(399);
        int expectedSpeed = 0;
        int actualSpeed = plane.getMaxSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }
}