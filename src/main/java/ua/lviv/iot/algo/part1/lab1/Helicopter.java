package ua.lviv.iot.algo.part1.lab1;


import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.BufferedWriter;
import java.io.IOException;



@Getter
@NoArgsConstructor


public class Helicopter extends AerialVehicle {

    protected static final int maxAltitude = 1000;
    private static final int id = 100;
    private static final int currentFuel = 10;
    private final static Helicopter defaultHelicopter = new Helicopter();
    private static boolean headerWritten = false;
    private int currentAltitude;
    private String manufacturer;

    public Helicopter(int currentAltitude, String manufacturer) {
        this.manufacturer = manufacturer;
        this.currentAltitude = currentAltitude;

    }

    public static void writeHeader(BufferedWriter writer) throws IOException {
        if (!headerWritten) {
            writer.write(new Helicopter().getHeaders());
            writer.newLine();
            headerWritten = true;
        }
    }

    public String getHeaders() {
        return super.getHeaders() + ","
                + "maxAltitude,"
                + "id," + "currentFuel,"
                + "currentAltitude,"
                + "manufacturer";
    }

    public String toCSV() {
        return super.toCSV() + ","
                + maxAltitude + ","
                + id + "," + currentAltitude
                + "," + currentFuel
                + "," + manufacturer;
    }


        else {
            this.currentAltitude = newAltitude;
        }

        if (fuelUpdated == 100) {



    public Helicopter accelerateHelicopter(int speed) {
        int newSpeed;
        int maxSpeed = getMaxSpeed();
        newSpeed = speed;
        if (newSpeed > maxSpeed) {
            System.out.println("maxSpeed = 300");
        }
        return defaultHelicopter;
    }

    public void write(BufferedWriter writer) throws IOException {
        writeHeader(writer);
        writer.write(this.toCSV());
        writer.newLine();
    }
}