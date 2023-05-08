package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelicopterTest {

    @Test
    void takeOff() {
        Helicopter helicopter = new  Helicopter();
        helicopter.takeOff();
        int expectedAltitude = 100;
        int actualAltitude = helicopter.getCurrentAltitude();
        assertEquals(expectedAltitude, actualAltitude);
    }

    @Test

    void testAscend1() {

    @Test
    void descend() {
        Helicopter helicopter = new Helicopter();
        helicopter.descend(0);
        int expectedAltitude = 0;
        int actualAltitude = helicopter.getCurrentAltitude();
        assertEquals(expectedAltitude, actualAltitude);
    }

    @Test
    void refuel() {
        Helicopter helicopter =new Helicopter();
        helicopter.refuel(100);
        int expectedAltitude = 0;
        int actualFuel = helicopter.getCurrentAltitude();
        assertEquals(expectedAltitude, actualFuel);
    }

    @Test
    void accelerateHelicopter() {
        Helicopter helicopter = new Helicopter();
        helicopter.accelerateHelicopter(200);
        int expectedSpeed = 0;
        int actualSpeed = helicopter.getMaxSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }

    @Test
    public void testTakeOff() {
        Helicopter helicopter = new Helicopter(0, "Test manufacturer");
        Helicopter result = helicopter.takeOff();
        assertEquals(0, result.getCurrentAltitude());
    }

    @Test
    public void testAscend() {
        Helicopter helicopter = new Helicopter(0, "Test manufacturer");
        Helicopter result = helicopter.ascend(500);
        assertEquals(0, result.getCurrentAltitude());

        Helicopter result1 = helicopter.ascend(Helicopter.maxAltitude);
        assertEquals(0, result1.getCurrentAltitude());
    }

    @Test
    public void testDescend() {
        Helicopter helicopter = new Helicopter(1000, "Test manufacturer");
        Helicopter result = helicopter.descend(500);
        assertEquals(0, result.getCurrentAltitude());

        Helicopter result2 = helicopter.descend(0);
        assertEquals(0, result2.getCurrentAltitude());
    }

    @Test
    public void testRefuel() {
        Helicopter helicopter = new Helicopter(0, "Test manufacturer");
        Helicopter result = helicopter.refuel(20);
        assertEquals(0, result.getCurrentAltitude());
    }

}