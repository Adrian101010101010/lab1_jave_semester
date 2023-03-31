package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
<<<<<<< HEAD:src1/ua/lviv/iot/algo/part1/lab1/Helicopter.java
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Helicopter extends AerialVehicle {
    private final int id = 100;
    private final int maxAltitude = 1000;
    private final int fuelCapacity = 30;
=======
public class Helicopter {

    private final int id=100;
    private  String model;
>>>>>>> parent of 4598269 (Update Helicopter.java):src/ua/lviv/iot/algo/part1/lab1/Helicopter.java
    private int currentAltitude;
    private final int maxAltitude=1000;
    private final int fuelCapacity = 30;
    private int currentFuel = 10;
    private int mass;


<<<<<<< HEAD:src1/ua/lviv/iot/algo/part1/lab1/Helicopter.java

    public Helicopter(int currentAltitude,String model){
        this.currentAltitude = currentAltitude;
        this.manufacturer = model;
=======
private static final Helicopter defaultHelicopter =new Helicopter();

public Helicopter(){}

    public static Helicopter getInstance(){
    return defaultHelicopter;
    };
    public String toString(){
    return "Helicopter{"
            + "id"+id+"model"+model+'}';
    }
    public Helicopter takeOff(){
        this.currentAltitude=100;
        System.out.println("Current altitude is ");
        System.out.println(this.currentAltitude);
        return defaultHelicopter;
>>>>>>> parent of 4598269 (Update Helicopter.java):src/ua/lviv/iot/algo/part1/lab1/Helicopter.java
    }
    public Helicopter ascend(int altitude){

<<<<<<< HEAD:src1/ua/lviv/iot/algo/part1/lab1/Helicopter.java
    private final static Helicopter defaultHelicopter = new Helicopter();


    public Helicopter takeOff() {
        this.currentAltitude = 100;
        return defaultHelicopter;
    }

    public Helicopter ascend(int altitude) {
        int newAltitude = this.currentAltitude + altitude;
        if (newAltitude > maxAltitude) {
=======
        int newAltitude= this.currentAltitude+altitude;
        if (newAltitude>maxAltitude){
>>>>>>> parent of 4598269 (Update Helicopter.java):src/ua/lviv/iot/algo/part1/lab1/Helicopter.java
            this.currentAltitude = maxAltitude;
        }
       else this.currentAltitude = newAltitude;
        System.out.println("Ascended to altitude ");
        System.out.println(this.currentAltitude);
        return defaultHelicopter;
    }
    public Helicopter descend(int altitude){
        int newAltitude = this.currentAltitude - altitude;
        if(newAltitude < 0) {
            this.currentAltitude = 0;
        } else this.currentAltitude = newAltitude;
        System.out.println("Descended to altitude ");
        System.out.println(this.currentAltitude);
        return defaultHelicopter;
    }
<<<<<<< HEAD:src1/ua/lviv/iot/algo/part1/lab1/Helicopter.java

    public Helicopter refuel(int fuel) {
=======
    public Helicopter refuel(int fuel){
>>>>>>> parent of 4598269 (Update Helicopter.java):src/ua/lviv/iot/algo/part1/lab1/Helicopter.java
        int fuelUpdated = this.currentFuel + fuel;
        if (fuelUpdated> this.fuelCapacity) {
            System.out.println("The tank is full");
            this.currentFuel = this.fuelCapacity;
        } else this.currentFuel = fuelUpdated;
        return defaultHelicopter;
    }
<<<<<<< HEAD:src1/ua/lviv/iot/algo/part1/lab1/Helicopter.java
    public Helicopter accelerateHelicopter(int speed){
        int newSpeed;
        newSpeed = speed;
        if (newSpeed>maxSpeed){
            newSpeed = maxSpeed;
            maxSpeed = 300;
        }

        return defaultHelicopter;
=======
    public static void main(String ... args){
        Helicopter helicopter = new Helicopter();
        System.out.println(helicopter);
        helicopter.takeOff();
        helicopter.ascend(20);
        helicopter.descend(10);
        helicopter.refuel(100);
>>>>>>> parent of 4598269 (Update Helicopter.java):src/ua/lviv/iot/algo/part1/lab1/Helicopter.java
    }
}