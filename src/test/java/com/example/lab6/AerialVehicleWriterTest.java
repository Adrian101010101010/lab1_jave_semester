package com.example.lab6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AerialVehicleWriterTest {
    private static final String filename = "test.csv";

    private AerialVehicleWriter writer;
    private List<AerialVehicle> vehicles;

    @BeforeEach
    public void setup() {
        writer = new AerialVehicleWriter();
        vehicles = new ArrayList<>();
        vehicles.add(new Helicopter());
        vehicles.add(new Drone());
        vehicles.add(new MilitaryDrone());
        vehicles.add(new Plane());
    }

    @Test
    public void testWriteToFile() throws IOException {
        writer.writeToFile(vehicles, filename);
        File file = new File(filename);
        assertTrue(file.exists());

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        assertEquals("maxSpeed, feliveryWeight, batteryCapacity," +
                " chargeConsumptionPerMinuteOfFlight, speed, manufacturer," +
                " maxAltitude, id, currentFuel, currentAltitude, flightRange, speedNow", line);

        line = reader.readLine();
        List<String> headers = Arrays.asList(line.split(", "));
        assertEquals(1, headers.size());
        assertFalse(headers.contains("manufacturer"));
        assertFalse(headers.contains("maxAltitude"));
        assertFalse(headers.contains("id"));

        line = reader.readLine();
        List<String> vehicleData = Arrays.asList(line.split(", "));
        assertEquals(1, vehicleData.size());
        assertEquals("0,0,0,0,0,null", vehicleData.get(0));
        assertEquals("0,0,0,0,0,null", vehicleData.get(0));
        assertEquals("0,0,0,0,0,null", vehicleData.get(0));

        reader.close();

    }

    @Test
    public void testCsvDrone() throws IOException {
        Drone drone = new Drone(100, "DJI", 100);

        BufferedWriter writer1 = new BufferedWriter(new FileWriter("drones.csv"));
        writer1.write(drone.getHeaders() + "\n");
        drone.write(writer1);
        writer1.close();
    }

    @Test
    public void testCSVHelicopter() throws IOException {
        Helicopter helicopter = new Helicopter(3500, "srt");

        BufferedWriter writer2 = new BufferedWriter(new FileWriter("helicopters.csv"));
        writer2.write(helicopter.getHeaders() + "\n");
        helicopter.write(writer2);
        writer2.close();
    }

    @Test
    public void testCSVMilitaryDrone() throws IOException {
        MilitaryDrone militaryDrone = new MilitaryDrone("shark", 1000);

        BufferedWriter writer3 = new BufferedWriter(new FileWriter("militaryDrones.csv"));
        writer3.write(militaryDrone.getHeaders() + "\n");
        militaryDrone.write(writer3);
        writer3.close();
    }

    @Test
    public void testCSVPlane() throws IOException {
        Plane plane = new Plane("746", 600);

        BufferedWriter writer4 = new BufferedWriter(new FileWriter("planes.csv"));
        writer4.write(plane.getHeaders() + "\n");
        plane.write(writer4);
        writer4.close();
    }
}
