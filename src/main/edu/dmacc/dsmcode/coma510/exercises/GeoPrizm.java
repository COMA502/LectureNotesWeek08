package edu.dmacc.dsmcode.coma510.exercises;

public class GeoPrizm extends Vehicle {
    public void fillGas(int gallons) {
        milesLeft = milesLeft + (int) (gallons * 32);
    }
}
