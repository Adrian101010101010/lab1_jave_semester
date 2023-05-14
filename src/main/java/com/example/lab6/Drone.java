package com.example.lab6;


import lombok.ToString;

import java.io.BufferedWriter;
import java.io.IOException;


/**
 * Drone is a class that represents a drone.
 */
@ToString
public class Drone extends AerialVehicle {
    /**
     * The default drone.
     */
    private static final Drone DEFAULT_DRONE = new Drone();

    /**
     * Indicates whether the header has been written to the CSV file.
     */
    private static boolean headerWritten = false;

    /**
     * The battery capacity of the drone in mAh.
     */
    private int batteryCapacity;

    /**
     * The charge consumption per minute of flight in mAh.
     */
    private int chargeConsumptionPerMinuteOfFlight;

    /**
     * The speed of the drone in km/h.
     */
    private int speed;

    /**
     * The manufacturer of the drone.
     */
    private String manufacturer;

    /**
     * Constructs a new Drone with the specified battery capacity,
     * manufacturer, and charge consumption per minute of flight.
     *
     * @param batteryCapacity1 the battery capacity of the drone in mAh
     * @param manufacturer1 the manufacturer of the drone
     * @param chargeConsumptionPerMinuteOfFlight1
     * the charge consumption per minute of flight in mAh
     */
    public Drone(final int batteryCapacity1, final String manufacturer1,
               final   int chargeConsumptionPerMinuteOfFlight1) {
        this.batteryCapacity = batteryCapacity1;
        this.manufacturer = manufacturer1;
        this.chargeConsumptionPerMinuteOfFlight =
                chargeConsumptionPerMinuteOfFlight1;
    }

    /**
     * Constructs a new default Drone.
     */
    public Drone() {
    }

    /**
     * Writes the header to the
     * specified BufferedWriter if it has not already been written.
     *
     * @param writer the BufferedWriter to write to
     * @throws IOException if an I/O error occurs
     */
    public final void writeHeader(final BufferedWriter writer)
            throws IOException {
        if (!headerWritten) {
            writer.write(new Drone().getHeaders());
            writer.newLine();
            headerWritten = true;
        }
    }

    /**
     * Returns a string representation of the headers for a CSV file.
     *
     * @return a string representation of the headers for a CSV file
     */
    public String getHeaders() {
        return super.getHeaders() + ","
                + "batteryCapacity,"
                + "chargeConsumptionPerMinuteOfFlight,"
                + "speed,"
                + "manufacturer";
    }

    /**
     * Returns a string representation of the object in CSV format.
     *
     * @return a string representation of the object in CSV format
     */
    public String toCSV() {
        return super.toCSV() + ","
                + batteryCapacity + ","
                + chargeConsumptionPerMinuteOfFlight + ","
                + speed + ","
                + manufacturer;
    }

    /**
     * The value representing half battery capacity.
     */
    private final int halfBatteryCapacity = 50;

    /**
     * Accelerates the drone by
     * the specified amount and returns the default drone.
     *
     * @param acceleration the amount to accelerate by in km/h
     * @return the default drone
     */

    public Drone fast(final int acceleration) {
        int newSpeed;
        int maxSpeed = getMaxSpeed();
        newSpeed = speed + acceleration;
        if (newSpeed > maxSpeed) {
            speed = maxSpeed;
        }
        if (batteryCapacity == halfBatteryCapacity) {
            System.out.println("speed = " + speed / 2);
        }
        if (batteryCapacity == 0) {
            System.out.println("speed = 0");
        }
        return DEFAULT_DRONE;
    }

    /**
     * Writes this Drone to the specified BufferedWriter.
     *
     * @param writer the BufferedWriter to write to
     * @throws IOException if an I/O error occurs
     */
    public final void write(final BufferedWriter writer) throws IOException {
        writeHeader(writer);
        writer.write(this.toCSV());
        writer.newLine();
    }

}