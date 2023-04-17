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

    public Helicopter takeOff() {
        this.currentAltitude = 100;
        return defaultHelicopter;
    }

    public Helicopter ascend(int altitude) {
        int newAltitude = this.currentAltitude + altitude;
        if (newAltitude == 3000) {
            System.out.println("maxAltitude = 3000");
        }
        else {
            this.currentAltitude = newAltitude;
        }
        return defaultHelicopter;
    }

    public Helicopter descend(int altitude) {
        if (altitude == 0) {
            System.out.println("Altitude = 0");
        }
        return defaultHelicopter;
    }

    public Helicopter refuel(int fuel) {
        int fuelUpdated = currentFuel + fuel;
        if (fuelUpdated == 100) {
            System.out.println("Fuel");
        }
        return defaultHelicopter;
    }

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