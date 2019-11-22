package edu.dmacc.dsmcode.coma510.exercises;

public class Vehicle {

    protected int milesLeft;// = 0;

    public Vehicle() {
        this.milesLeft = 0;
    }

    public int milesLeft() {
        return milesLeft;
    }

    public void drive(int miles) {
//        milesLeft -= miles;
        milesLeft = milesLeft - miles;
    }
}
