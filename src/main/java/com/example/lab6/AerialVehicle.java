/**
 * This package contains classes for the first lab of the Algorithms course.
 */
package com.example.lab6;

/**
 * An abstract class representing an aerial vehicle.
 */
public abstract class AerialVehicle {
    /**
     * The maximum speed of the aerial vehicle in km/h.
     */
    private int maxSpeed;

    /**
     * The maximum weight of the delivery in kg.
     */
    private int feliveryWeight;

    /**
     * Returns the maximum speed of the aerial vehicle in km/h.
     *
     * @return the maximum speed of the aerial vehicle in km/h
     */
    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Returns the maximum weight of the delivery in kg.
     *
     * @return the maximum weight of the delivery in kg
     */
    public int getFeliveryWeight() {
        return feliveryWeight;
    }

    /**
     * Returns a string representation of the headers for a CSV file.
     *
     * @return a string representation of the headers for a CSV file
     */
    public String getHeaders() {
        return "maxSpeed" + "," + "feliveryWeight";
    }

    /**
     * Returns a string representation of the object in CSV format.
     *
     * @return a string representation of the object in CSV format
     */
    public String toCSV() {
        return maxSpeed + "," + feliveryWeight;
    }
}
