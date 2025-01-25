package dev.omuzalevska.tollandvehicles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TollStationTest {
    @Test
    void testTollStationProcessing() {
        TollStation station = new TollStation("Test Station", "Test City");
        station.processVehicle(new Car("ABC-123"));
        station.processVehicle(new Motorcycle("DEF-456"));
        station.processVehicle(new Truck("GHI-789", 3)); // 3 axles

        // Total toll: 100 + 50 + 150 = 300
        assertEquals(300.0, station.getTotalTollCollected(), "Total toll collected should be $300");
    }

    @Test
    void testTollStationVehicleList() {
        TollStation station = new TollStation("Test Station", "Test City");

        Car car = new Car("CAR-123");
        Motorcycle motorcycle = new Motorcycle("BIKE-456");

        station.processVehicle(car);
        station.processVehicle(motorcycle);

        assertEquals(2, station.getVehicles().size(), "Station should have processed 2 vehicles");
        assertTrue(station.getVehicles().contains(car), "Station should contain the car");
        assertTrue(station.getVehicles().contains(motorcycle), "Station should contain the motorcycle");
    } 

    @Test
    void testEmptyStation() {
        TollStation station = new TollStation("Test Station", "Test City");

        assertEquals(0.0, station.getTotalTollCollected(), "Total toll should be $0 for empty station");
        assertTrue(station.getVehicles().isEmpty(), "Vehicle list should be empty for new station");
    }

    @Test
    void testProcessVehicleAndTotalToll() {
        TollStation station = new TollStation("Test Station", "Test City");

        station.processVehicle(new Car("CAR-123"));
        station.processVehicle(new Motorcycle("BIKE-456"));
        station.processVehicle(new Truck("TRUCK-789", 4)); // 4 axles

        // Check total toll collected
        assertEquals(350.0, station.getTotalTollCollected(), "Total toll should be $350.0");

        // Check number of vehicles
        assertEquals(3, station.getVehicles().size(), "Should process 3 vehicles");
    }
}
