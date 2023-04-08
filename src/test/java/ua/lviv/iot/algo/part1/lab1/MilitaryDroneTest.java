package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MilitaryDroneTest {

    @Test
    void PPOSee() {
        MilitaryDrone  militaryDrone = new MilitaryDrone();
        militaryDrone.PPOSee(0);
        int expectedPercentageOfInvisibility = 0;
        int actualPercentageOfInvisibility = militaryDrone.getMaxSpeed();
        assertEquals(expectedPercentageOfInvisibility, actualPercentageOfInvisibility);
    }
}