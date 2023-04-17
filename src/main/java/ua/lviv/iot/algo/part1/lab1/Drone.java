package ua.lviv.iot.algo.part1.lab1;


import lombok.ToString;

import java.io.BufferedWriter;
import java.io.IOException;

@ToString
public class Drone extends AerialVehicle {
    private final static Drone defaultDrone = new Drone();
    private static boolean headerWritten = false;
    private int batteryCapacity;
    private int chargeConsumptionPerMinuteOfFlight;
    private int speed;
    private String manufacturer;

    public Drone(int batteryCapacity, String manufacturer,
                 int chargeConsumptionPerMinuteOfFlight) {
        this.batteryCapacity = batteryCapacity;
        this.manufacturer = manufacturer;
        this.chargeConsumptionPerMinuteOfFlight =
                chargeConsumptionPerMinuteOfFlight;
    }

    public Drone() {
    }

    public static void writeHeader(BufferedWriter writer) throws IOException {
        if (!headerWritten) {
            writer.write(new Drone().getHeaders());
            writer.newLine();
            headerWritten = true;
        }
    }

    public String getHeaders() {
        return super.getHeaders() + ","
                + "batteryCapacity,"
                + "chargeConsumptionPerMinuteOfFlight,"
                + "speed,"
                + "manufacturer";
    }

    public String toCSV() {
        return super.toCSV() + ","
                + batteryCapacity + ","
                + chargeConsumptionPerMinuteOfFlight + ","
                + speed + ","
                + manufacturer;
    }

    public Drone fast(int acceleration) {
        int newSpeed;
        int maxSpeed = getMaxSpeed();
        newSpeed = speed + acceleration;
        if (newSpeed > maxSpeed) {
            speed = 300;
        }
        if (batteryCapacity == 50) {
            System.out.println("speed = 150");
        }
        if (batteryCapacity == 0) {
            System.out.println("speed = 0");
        }
        return defaultDrone;
    }

    public void write(BufferedWriter writer) throws IOException {
        writeHeader(writer);
        writer.write(this.toCSV());
        writer.newLine();
    }

}
