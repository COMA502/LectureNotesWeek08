package edu.dmacc.dsmcode.coma510.exercises;

public class Main {
    public static void main(String[] args) {
        TeslaModelS tesla = new TeslaModelS();
        GeoPrizm geo = new GeoPrizm();

        tesla.charge(12);
        geo.fillGas(10);

        tesla.drive(100);
        geo.drive(100);

        System.out.println("Tesla has " + tesla.milesLeft() + " miles left");
        System.out.println("Geo has " + geo.milesLeft() + " miles left");
    }
}
