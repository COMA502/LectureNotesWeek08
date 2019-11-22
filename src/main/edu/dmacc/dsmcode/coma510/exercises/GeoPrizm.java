package edu.dmacc.dsmcode.coma510.exercises;

public class GeoPrizm extends Vehicle {
    public GeoPrizm() {
        super("Ugh... My geo...");
    }

    public void fillGas(int gallons) {
        milesLeft = milesLeft + (int) (gallons * 32);
    }
}
