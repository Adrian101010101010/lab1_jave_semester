package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;


import java.io.BufferedWriter;
import java.io.IOException;

@ToString
public class Plane extends AerialVehicle {
    private final static Plane defaultPlane = new Plane(); //defaultPlane
    private static boolean headerWritten = false; //headerWritten
    private String manufacturer; //manufacturer
    private int speedNow; //speedNow

    public Plane(String manufacturer, int speedNow) {



    public Plane() {
    }

    public static void writeHeader(BufferedWriter writer) throws IOException {
        if (!headerWritten) {
            writer.write(new Plane().getHeaders());
            writer.newLine();
            headerWritten = true;
        }
    }

    public String getHeaders() {
        return super.getHeaders() + ","
                + "manufacturer,"
                + "speedNow";
    }

    public String toCSV() {
        return super.toCSV() + ","
                + manufacturer
                + speedNow;
    }

    public Plane fast(int acceleration) {
        int newSpeed;
        int maxSpeed = getMaxSpeed();
        newSpeed = speedNow + acceleration;
        if (maxSpeed == 568) {
            System.out.println("maxSpeed = 568");
        }
        if (newSpeed == 360) {

    public void write(BufferedWriter writer) throws IOException {
        writeHeader(writer);
        writer.write(this.toCSV());
        writer.newLine();
    }


}
