package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @Test
    void fast() {
        Plane plane = new Plane("Test manufacturer",0);
        plane.fast(568);
        int expectedSpeed = 0;
        int actualSpeed = plane.getMaxSpeed();
        assertEquals(expectedSpeed, actualSpeed);

        plane.fast(360);
        int expectedSpeed1 = 0;
        int actualSpeed1 = plane.getMaxSpeed();
        assertEquals(expectedSpeed1, actualSpeed1);
    }
}