package edu.dmacc.dsmcode.coma510.exercises;

public class Main {
    public static void main(String[] args) {
//        new Vehicle("unknown");//abstract cannot be instantiated
        TeslaModelS tesla = new TeslaModelS();
        GeoPrizm geo = new GeoPrizm();

        tesla.charge(12);
        geo.fillGas(10);

        if(tesla.canDrive()) {
            tesla.drive(100);
        }
        if(geo.canDrive()) {
            geo.drive(100);
        }

        tesla.serviceVehicle();
        geo.serviceVehicle();

        System.out.println(tesla.getName() + " has " + tesla.milesLeft() + " miles left");
        System.out.println(geo.getName() + " has " + geo.milesLeft() + " miles left");
    }
}
