package ua.lviv.iot.algo.part1.lab1;

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
                 final int droneWeight = 100;
        final String droneModel = "DJI";
        final int droneSpeed = 100;
        final String droneFileName = "drones.csv";

        final int helicopterWeight = 3500;
        final String helicopterModel = "srt";
        final String helicopterFileName = "helicopters.csv";

        final String militaryDroneModel = "shark";
        final int militaryDroneWeight = 1000;
        final String militaryDroneFileName = "militaryDrones.csv";

        final String planeModel = "746";
        final int planeSpeed = 600;
        final String planeFileName = "planes.csv";

        List<AerialVehicle> aerialVehicleList1 = new ArrayList<>();
        aerialVehicleList1.add(new Drone(droneWeight, droneModel, droneSpeed));
        aerialVehicleList1.add(new Helicopter(helicopterWeight, helicopterModel));
        aerialVehicleList1.add(new MilitaryDrone(militaryDroneModel, militaryDroneWeight));
        aerialVehicleList1.add(new Plane(planeModel, planeSpeed));

        writeToFile(aerialVehicleList, "aerialVehicles.csv");
    }
}