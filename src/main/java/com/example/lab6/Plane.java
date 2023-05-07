package com.example.lab6;

import java.io.BufferedWriter;
import java.io.IOException;

public class Plane extends AerialVehicle{
    private Long id;
    private String name;
    private String model;
    private Integer year;
    private Integer seats;
    private String serialNumber;
    private String manufacturer;
    private Integer maxSpeed;
    private Integer range;
    private String engineType;

    // Конструктор
    public Plane(Long id, String name, String model, Integer year, Integer seats, String serialNumber,
                 String manufacturer, Integer maxSpeed, Integer range, String engineType) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.year = year;
        this.seats = seats;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.maxSpeed = maxSpeed;
        this.range = range;
        this.engineType = engineType;
    }

    // Геттери і сеттери
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
       this.engineType = engineType;
    }

    /**
     * The default plane.
     */
    private static final Plane DEFAULT_PLANE = new Plane();
    /**
     * Flag indicating whether the header has been written.
     */
    private static boolean headerWritten = false;
    /**
     * The current speed of the plane.
     */
    private int speedNow;

    /**
     * Constructs a new Plane object with the specified manufacturer and speed.
     *
     * @param manufacturer1 the manufacturer of the plane
     * @param speedNow1 the current speed of the plane
     */
    public Plane(final String manufacturer1, final int speedNow1) {
        this.manufacturer = manufacturer1;
        this.speedNow = speedNow1;
    }

    /**
     * Constructs a new Plane object with default values.
     */
    public Plane() {
    }

    /**
     * Writes the header for the plane data to a file using a BufferedWriter.
     *
     * @param writer the BufferedWriter to use for writing
     * @throws IOException if an I/O error occurs
     */
    public final void writeHeader(final BufferedWriter writer)
            throws IOException {
        if (!headerWritten) {
            writer.write(new Plane().getHeaders());
            writer.newLine();
            headerWritten = true;
        }
    }

    /**
     * Returns the headers for the plane data in CSV format.
     *
     * @return the headers for the plane data in CSV format
     */
    public String getHeaders() {
        return super.getHeaders() + ","
                + "manufacturer,"
                + "speedNow";
    }

    /**
     * Returns the plane data in CSV format.
     *
     * @return the plane data in CSV format
     */
    public String toCSV() {
        return super.toCSV() + ","
                + manufacturer
                + speedNow;
    }

    /**
     * Accelerates the plane by the specified amount.
     *
     */
    private static final int TARGET_SPEED = 360;

    /**
     * Calculates a new speed for the Plane based on the
     * acceleration and prints a message if the new speed
     * is equal to the maximum speed or the target speed.
     *
     * @param acceleration the acceleration to apply
     * @return the updated Plane object
     */
    public Plane fast(final int acceleration) {
        int newSpeed;
        int maxSpeed = getMaxSpeed();
        newSpeed = speedNow + acceleration;
        if (newSpeed == maxSpeed) {
            System.out.println("maxSpeed = " + maxSpeed);
        }
        if (newSpeed == TARGET_SPEED) {
            System.out.println("newSpeed = " + TARGET_SPEED);
        }
        return DEFAULT_PLANE;
    }

    /**
     * Writes the plane data to a file using a BufferedWriter.
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
