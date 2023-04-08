package ua.lviv.iot.algo.part1.lab1;


public abstract class AerialVehicle {
    private String manufacturer;
    private int maxSpeed;
    private int FlyingDistance;
    private int DeliveryWeight;


   // public abstract void getMaxFlyingDistance();
  //  public abstract void getMaxDeliveryWeight();

    public int getMaxSpeed(){return maxSpeed;}
    public int flyingDistance(){return FlyingDistance;}
    public int feliveryWeight(){return DeliveryWeight;}
}
