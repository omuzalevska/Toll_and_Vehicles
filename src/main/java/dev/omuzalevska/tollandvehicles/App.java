package dev.omuzalevska.tollandvehicles;

public class App {
    public static void main(String[] args) {
    TollStation station = new TollStation("Central Toll", "Kyiv");

    station.processVehicle(new Car("ABC-123"));
    station.processVehicle(new Motorcycle("DEF-456"));
    station.processVehicle(new Truck("GHI-789", 3)); 

    station.printReport();
    }
}