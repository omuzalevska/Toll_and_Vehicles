package dev.omuzalevska.tollandvehicles;

class Car extends Vehicle {
    private static final double TOLL_RATE = 100.0;

    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public double calculateToll() {
        return TOLL_RATE;
    }
}