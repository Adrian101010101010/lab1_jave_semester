package ua.lviv.iot.algo.part1.lab1;


public abstract class AerialVehicle {

    private int maxSpeed;

    private int feliveryWeight;


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getFeliveryWeight() {
        return feliveryWeight;
    }

    public String getHeaders() {
        return "maxSpeed" + "," + "feliveryWeight";
    }

    public String toCSV() {
        return maxSpeed + "," + feliveryWeight;
    }
}
