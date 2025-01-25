package dev.omuzalevska.tollandvehicles;

class Truck extends Vehicle {
    private static final double TOLL_PER_AXLE = 50.0;
    private int axles;

    public Truck(String licensePlate, int axles) {
        super(licensePlate);
        this.axles = axles;
    }

    @Override
    public double calculateToll() {
        return axles * TOLL_PER_AXLE;
    }

    @Override
    public String toString() {
        return super.toString() + ", Axles: " + axles;
    }
}