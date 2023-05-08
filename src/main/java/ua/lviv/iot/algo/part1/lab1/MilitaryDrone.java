package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;


import java.io.BufferedWriter;
import java.io.IOException;

@ToString

public class MilitaryDrone extends AerialVehicle {
    private final static MilitaryDrone defaultMilitaryDrone=new MilitaryDrone();
    private static boolean headerWritten = false;
    private String manufacturer;
    private int flightRange;

    public MilitaryDrone(String manufacturer, int flightRange) {



    public MilitaryDrone() {
    }

    public static void writeHeader(BufferedWriter writer) throws IOException {
        if (!headerWritten) {
            writer.write(new MilitaryDrone().getHeaders());
            writer.newLine();
            headerWritten = true;
        }
    }

    public String getHeaders() {
        return super.getHeaders() + ","
                + "manufacturer,"
                + "flightRange";
    }

    public String toCSV() {
        return super.toCSV() + ","
                + manufacturer
                + flightRange;
    }

    public MilitaryDrone PPOSee(int percentageOfInvisibility) {
        if (percentageOfInvisibility == 100) {
            System.out.println("дрон переміг");
        }
        if (percentageOfInvisibility == 50) {
            System.out.println("дрон нічия");
        }
        if (percentageOfInvisibility == 0) {



    public void write(BufferedWriter writer) throws IOException {
        writeHeader(writer);
        writer.write(this.toCSV());
        writer.newLine();
    }

}
