package ua.lviv.iot.algo.part1.lab1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AerialVehicleWriter {
    public static final String newLineSeparator = "\n";
    private static final String CSVHeader = "maxSpeed, "
            + "feliveryWeight, batteryCapacity, "
            + "chargeConsumptionPerMinuteOfFlight, speed, "
            + "manufacturer, maxAltitude, id, currentFuel,"
            + " currentAltitude, flightRange, speedNow";

    public void writeToFile(List<AerialVehicle> aerialVehicleList, String fileName)
            throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        writer.write(CSVHeader);
        writer.append(newLineSeparator);
        for (AerialVehicle aerialVehicle : aerialVehicleList) {
            writer.write(aerialVehicle.toCSV());
            writer.append(newLineSeparator);
        }
        writer.close();

        Drone drone = new Drone(
                100,"DJI",100);
        BufferedWriter writer1 = new BufferedWriter(
                new FileWriter("drones.csv"));
        drone.write(writer1);
        writer1.close();

        Helicopter helicopter = new Helicopter(
                3500,"srt");
        BufferedWriter writer2 = new BufferedWriter(
                new FileWriter("helicopters.csv"));
        helicopter.write(writer2);
        writer2.close();

        MilitaryDrone militaryDrone = new MilitaryDrone(
                "shark",1000);
        BufferedWriter writer3 = new BufferedWriter(
                new FileWriter("militaryDrones.csv"));
        militaryDrone.write(writer3);
        writer3.close();

        Plane plane = new Plane("746", 600);
        BufferedWriter writer4 = new BufferedWriter(
                new FileWriter("planes.csv"));
        plane.write(writer4);
        writer4.close();
    }
}
