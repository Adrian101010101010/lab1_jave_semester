package ua.lviv.iot.algo.part1.lab1;

import java.io.BufferedWriter;
import java.io.IOException;

public class Plane extends AerialVehicle {
    /**
     * The default plane.
     */
    private static final Plane DEFAULT_PLANE = new Plane();
    /**
     * Accelerates the plane by the specified amount.
     */
    private static final int TARGET_SPEED = 360;
    /**
     * Flag indicating whether the header has been written.
     */
    private static boolean headerWritten = false;
    /**
     * A flag indicating whether a header has already been
     * written when outputting data.
     */
    private Long id;
    /**
     * The unique identifier of the object.
     */
    private String name;
    /**
     * Name of the object.
     */
    private String model;

    private Integer year;
    private Integer seats;
    private String serialNumber;
    private String manufacturer;
    private Integer maxSpeed;
    private Integer range;
    private String engineType;
    /**
     * The current speed of the plane.
     */
    private int speedNow;

    /**
     * @param id           id
     * @param name         name
     * @param model        model
     * @param year         year
     * @param seats        seats
     * @param serialNumber serialNumber
     * @param manufacturer manufacturer
     * @param maxSpeed     maxSpeed
     * @param range        range
     * @param engineType   engineType
     */
    public Plane(Long id, String name, String model,
                 Integer year, Integer seats, String serialNumber,
                 String manufacturer, Integer maxSpeed,
                 Integer range, String engineType) {
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

    /**
     * Constructs a new Plane object with the specified manufacturer
     * and speed.
     *
     * @param manufacturer1 the manufacturer of the plane
     * @param speedNow1     the current speed of the plane
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
     * Gets the ID of the plane.
     *
     * @return the ID of the plane
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return return model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return return year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Sets the year of the aircraft.
     *
     * @param year the year to set
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * Gets the number of seats of the aircraft.
     *
     * @return the number of seats
     */
    public Integer getSeats() {
        return seats;
    }

    /**
     * Sets the number of seats of the aircraft.
     *
     * @param seats the number of seats to set
     */
    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    /**
     * Gets the serial number of the aircraft.
     *
     * @return the serial number
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the serial number of the aircraft.
     *
     * @param serialNumber the serial number to set
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Gets the manufacturer of the aircraft.
     *
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the manufacturer of the aircraft.
     *
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Gets the maximum speed of the aircraft.
     *
     * @return the maximum speed
     */
    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Sets the maximum speed of the aircraft.
     *
     * @param maxSpeed the maximum speed to set
     */
    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * Gets the range of the aircraft.
     *
     * @return the range
     */
    public Integer getRange() {
        return range;
    }

    /**
     * Sets the range of the aircraft.
     *
     * @param range the range to set
     */
    public void setRange(Integer range) {
        this.range = range;
    }

    /**
     * Gets the engine type of the aircraft.
     *
     * @return the engine type
     */
    public String getEngineType() {
        return engineType;
    }

    /**
     * Sets the engine type of the aircraft.
     *
     * @param engineType the engine type to set
     */
    public void setEngineType(String engineType) {
        this.engineType = engineType;
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
     * Calculates a new speed for the Plane based on the
     * acceleration and prints a message if the new speed
     * is equal to the maximum speed or the target speed.
     *
     * @param acceleration the acceleration to apply
     */
    public void fast(final int acceleration) {
        int newSpeed;
        int maxSpeed = getMaxSpeed();
        newSpeed = speedNow + acceleration;
        if (newSpeed == maxSpeed) {
            System.out.println("maxSpeed = " + maxSpeed);
        }
        if (newSpeed == TARGET_SPEED) {
            System.out.println("newSpeed = " + TARGET_SPEED);
        }
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
