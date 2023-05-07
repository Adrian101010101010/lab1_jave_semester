package com.example.lab6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AerialVehicleWriter is a class
 * that writes a list of AerialVehicles to a CSV file.
 */
public class AerialVehicleWriter {
    /**
     * The new line separator for the CSV file.
     */
    public static final String NEW_LINE_SEPARATOR = "\n";

    /**
     * The header for the CSV file.
     */
    private static final String CSV_HEADER = "maxSpeed, "
            + "feliveryWeight, batteryCapacity, "
            + "chargeConsumptionPerMinuteOfFlight, speed, "
            + "manufacturer, maxAltitude, id, currentFuel,"
            + " currentAltitude, flightRange, speedNow";

    /**
     * Writes a list of AerialVehicles to a CSV file.
     *
     * @param aerialVehicleList the list of AerialVehicles to write
     * @param fileName the name of the file to write to
     * @throws IOException if an I/O error occurs
     */
    public static void writeToFile(final List<AerialVehicle> aerialVehicleList,
                                   final String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            writer.write(CSV_HEADER);
            writer.append(NEW_LINE_SEPARATOR);
            for (AerialVehicle aerialVehicle : aerialVehicleList) {
                writer.write(aerialVehicle.toCSV());
                writer.append(NEW_LINE_SEPARATOR);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
                 public static void main(String[] args) throws IOException {
        List<AerialVehicle> aerialVehicleList = new ArrayList<>();
        aerialVehicleList.add(new Drone(100, "DJI", 100));
        aerialVehicleList.add(new Helicopter(3500, "srt"));
        aerialVehicleList.add(new MilitaryDrone("shark", 1000));
        aerialVehicleList.add(new Plane("746", 600));

        writeToFile(aerialVehicleList, "aerialVehicles.csv");
    }

}