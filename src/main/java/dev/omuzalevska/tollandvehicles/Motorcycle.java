package dev.omuzalevska.tollandvehicles;

class Motorcycle extends Vehicle {
    private static final double TOLL_RATE = 50.0;

    public Motorcycle(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public double calculateToll() {
        return TOLL_RATE;
    }
}
