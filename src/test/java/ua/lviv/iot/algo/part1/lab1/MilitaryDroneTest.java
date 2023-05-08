package ua.lviv.iot.algo.part1.lab1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MilitaryDroneTest {

    @Test
    void PPOSee() {
        MilitaryDrone  militaryDrone = new MilitaryDrone ("Test manufacturer",0);
        militaryDrone.PPOSee(0);
        int expectedPercentageOfInvisibility = 0;
        int actualPercentageOfInvisibility = militaryDrone.getMaxSpeed();
        assertEquals(expectedPercentageOfInvisibility, actualPercentageOfInvisibility);

        militaryDrone.PPOSee(100);
        int expectedPercentageOfInvisibility1 = 0;
        int actualPercentageOfInvisibility1 = militaryDrone.getMaxSpeed();
        assertEquals(expectedPercentageOfInvisibility1, actualPercentageOfInvisibility1);

        militaryDrone.PPOSee(50);
        int expectedPercentageOfInvisibility2 = 0;
        int actualPercentageOfInvisibility2 = militaryDrone.getMaxSpeed();
        assertEquals(expectedPercentageOfInvisibility2, actualPercentageOfInvisibility2);
    }
}