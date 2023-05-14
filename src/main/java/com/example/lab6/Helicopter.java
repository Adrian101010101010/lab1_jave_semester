package com.example.lab6;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Helicopter is a class that represents a helicopter.
 */

@Getter
@NoArgsConstructor
public class Helicopter extends AerialVehicle {
    /**
     * The maximum altitude of the helicopter in meters.
     */
    protected static final int MAX_ALTITUDE = 1000;

    /**
     * The id of the helicopter.
     */
    private static final int ID = 100;

    /**
     * The current fuel level of the helicopter in liters.
     */
    private static final int CURRENT_FUEL = 10;

    /**
     * The default helicopter.
     */
    private  static final Helicopter  DEFAULT_HELICOPTER = new Helicopter();

    /**
     * Indicates whether the header has been written to the CSV file.
     */
    private static boolean headerWritten = false;

    /**
     * The current altitude of the helicopter in meters.
     */
    private int currentAltitude;

    /**
     * The manufacturer of the helicopter.
     */
    private String manufacturer;

    /**
     * Constructs a new Helicopter with
     * the specified current altitude and manufacturer.
     *
     * @param currentAltitude1 the current altitude of the helicopter in meters
     * @param manufacturer1 the manufacturer of the helicopter
     */
    public Helicopter(final int currentAltitude1, final String manufacturer1) {
        this.manufacturer = manufacturer1;
        this.currentAltitude = currentAltitude1;
    }

    /**
     * Writes the header to the specified BufferedWriter
     * if it has not already been written.
     *
     * @param writer the BufferedWriter to write to
     * @throws IOException if an I/O error occurs
     */
    public final void writeHeader(final BufferedWriter writer)
            throws IOException {
        if (!headerWritten) {
            writer.write(new Helicopter().getHeaders());
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
                + "Max_Altitude,"
                + "ID," + "Current_Fuel,"
                + "currentAltitude,"
                + "manufacturer";
    }

    /**
     * Returns a string representation of the object in CSV format.
     *
     * @return a string representation of the object in CSV format
     */
    public String toCSV() {
        return super.toCSV() + ","
                + MAX_ALTITUDE + ","
                + ID + "," + currentAltitude
                + "," + CURRENT_FUEL
                + "," + manufacturer;
    }

    /**
     * Takes off and returns the default helicopter.
     *
     */
    private static final int TAKE_OFF_ALTITUDE = 100;

    /**
     * Takes off the helicopter and sets its current altitude
     * to the takeoff altitude.
     *
     */
    public Helicopter takeOff() {
        this.currentAltitude = (TAKE_OFF_ALTITUDE);
        return DEFAULT_HELICOPTER;
    }

    /**
     * Ascends by the specified altitude and returns the default helicopter.
     *
     */
    private static final int MAX_ALTITUDE1 = 3000;

    /**
     * Increases the altitude of the Helicopter by the specified amount.
     *
     * @param altitude the amount to increase the altitude by
     * @return the updated Helicopter object
     */
    public Helicopter ascend(final int altitude) {
        int newAltitude = this.currentAltitude + altitude;
        if (newAltitude >= MAX_ALTITUDE1) {
            System.out.println("maxAltitude = " + MAX_ALTITUDE1);
        } else {
            this.currentAltitude = newAltitude;
        }
        return DEFAULT_HELICOPTER;
    }

    /**
     * Descends the helicopter to the specified altitude.
     *
     * @param altitude the altitude to descend to
     * @return the default helicopter
     */
    public Helicopter descend(final int altitude) {
        if (altitude == 0) {
            System.out.println("Altitude = 0");
        }
        return DEFAULT_HELICOPTER;
    }

    /**
     * Refuels the helicopter with the specified amount of fuel.
     *
     */
    private static final int MAX_FUEL = 100;

    /**
     * Refuels the helicopter with the specified amount of fuel.
     *
     * @param fuel the amount of fuel to add
     * @return the updated helicopter object
     */
    public Helicopter refuel(final int fuel) {
        int fuelUpdated = CURRENT_FUEL + fuel;
        if (fuelUpdated >= MAX_FUEL) {
            System.out.println("Fuel");
        }
        return DEFAULT_HELICOPTER;
    }

    /**
     * Accelerates the helicopter to the specified speed.
     *
     * @param speed the speed to accelerate to
     * @return the default helicopter
     */
    public Helicopter accelerateHelicopter(final int speed) {
        int newSpeed;
        int maxSpeed = getMaxSpeed();
        newSpeed = speed;
        if (newSpeed > maxSpeed) {
            System.out.println("maxSpeed = 300");
        }
        return DEFAULT_HELICOPTER;
    }

    /**
     * Writes the helicopter data to a file using a BufferedWriter.
     *
     * @param writer the BufferedWriter to use for writing
     * @throws IOException if an I/O error occurs
     */
    public final void write(final BufferedWriter writer) throws IOException {
        writeHeader(writer);
        writer.write(this.toCSV());
        writer.newLine();
    }
}