package com.example.lab6;

import lombok.ToString;

import java.io.BufferedWriter;
import java.io.IOException;

 /**
 * MilitaryDrone is a class that represents a military drone.
 */

 @ToString
public class MilitaryDrone extends AerialVehicle {
    /**
     * The default military drone.
     */
    private static final MilitaryDrone DEFAULT_MILITARY_DRONE =
            new MilitaryDrone();

    /**
     * Indicates whether the header has been written to the CSV file.
     */
    private static boolean headerWritten = false;

    /**
     * The manufacturer of the military drone.
     */
    private String manufacturer;

    /**
     * The flight range of the military drone in km.
     */
    private int flightRange;

    /**
     * Constructs a new MilitaryDrone with
     * the specified manufacturer and flight range.
     *
     * @param manufacturer1 the manufacturer of the military drone
     * @param flightRange1 the flight range of the military drone in km
     */
    public MilitaryDrone(final String manufacturer1, final int flightRange1) {
        this.manufacturer = manufacturer1;
        this.flightRange = flightRange1;
    }

    /**
     * Constructs a new default MilitaryDrone.
     */
    public MilitaryDrone() {
    }

    /**
     * Writes the header to the specified
     * BufferedWriter if it has not already been written.
     *
     * @param writer the BufferedWriter to write to
     * @throws IOException if an I/O error occurs
     */
    public final void writeHeader(final BufferedWriter writer)
            throws IOException {
        if (!headerWritten) {
            writer.write(new MilitaryDrone().getHeaders());
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
                + "manufacturer,"
                + "flightRange";
    }

    /**
     * Returns a string representation of the object in CSV format.
     *
     * @return a string representation of the object in CSV format
     */
    public String toCSV() {
        return super.toCSV() + ","
                + manufacturer
                + flightRange;
    }

    /**
     * Sets the percentage of invisibility and returns the default
     * military drone.
     *
     */
    private static final int MAX_INVISIBILITY = 100;
    /**
     * The value representing half invisibility.
     */
    private static final int HALF_INVISIBILITY = 50;
    /**
     * The value representing no invisibility.
     */
    private static final int NO_INVISIBILITY = 0;

    /**
     * Checks the percentage of invisibility of the Military Drone and
     * prints a message based on the value.
     *
     * @param percentageOfInvisibility the percentage of invisibility to check
     * @return the updated Military Drone object
     */
    public MilitaryDrone ppoSee(final int percentageOfInvisibility) {
        if (percentageOfInvisibility == MAX_INVISIBILITY) {
            System.out.println("дрон переміг");
        }
        if (percentageOfInvisibility == HALF_INVISIBILITY) {
            System.out.println("дрон нічия");
        }
        if (percentageOfInvisibility == NO_INVISIBILITY) {
            System.out.println("дрон програш");
        }
        return DEFAULT_MILITARY_DRONE;
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
