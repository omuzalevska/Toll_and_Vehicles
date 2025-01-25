package dev.omuzalevska.tollandvehicles;

abstract class Vehicle {
    protected String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public abstract double calculateToll();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " - License Plate: " + licensePlate;
    }
}