package dev.omuzalevska.tollandvehicles;

import java.util.ArrayList;
import java.util.List;

class TollStation {
    private String name;
    private String city;
    private double totalTollCollected;
    private List<Vehicle> vehicles;

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.vehicles = new ArrayList<>();
        this.totalTollCollected = 0;
    }

    // Method to process a vehicle
    public void processVehicle(Vehicle vehicle) {
        double toll = vehicle.calculateToll();
        totalTollCollected += toll;
        vehicles.add(vehicle);
    }

    // Print report of all vehicles and total toll collected
    public void printReport() {
        System.out.println("Toll Station: " + name + ", City: " + city);
        System.out.println("Vehicles processed:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
        System.out.println("Total Toll Collected: $" + totalTollCollected);
    }

    public double getTotalTollCollected() {
        return totalTollCollected;
    }
    
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
    
}