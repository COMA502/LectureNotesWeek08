package edu.dmacc.dsmcode.coma510.exercises;

public class TeslaModelS extends Vehicle {
    public TeslaModelS() {
        super("My Tesla!");
    }

    public void charge(int hours) {
        milesLeft = milesLeft + (int) (hours * 11.5);
    }
}
