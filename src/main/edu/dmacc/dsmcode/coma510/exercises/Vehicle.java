package edu.dmacc.dsmcode.coma510.exercises;

public class Vehicle {

    protected int milesLeft;// = 0;
    private String name;

    public Vehicle(String name) {
        this.name = name;
        this.milesLeft = 0;
    }

    public int milesLeft() {
        return milesLeft;
    }

    public void drive(int miles) {
//        milesLeft -= miles;
        milesLeft = milesLeft - miles;
    }

    public String getName() {
        return name;
    }
}
