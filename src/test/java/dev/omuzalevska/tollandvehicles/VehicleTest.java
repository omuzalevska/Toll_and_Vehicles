package dev.omuzalevska.tollandvehicles;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.Test;

public class VehicleTest {
    @Test
    void testVehicleListContents() {
        TollStation station = new TollStation("Test Station", "Test City");

        Car car = new Car("CAR-123");
        Motorcycle motorcycle = new Motorcycle("BIKE-456");
        Truck truck = new Truck("TRUCK-789", 2);

        station.processVehicle(car);
        station.processVehicle(motorcycle);
        station.processVehicle(truck);

        List<Vehicle> vehicles = station.getVehicles();

        assertTrue(vehicles.contains(car), "Vehicle list should contain the car");
        assertTrue(vehicles.contains(motorcycle), "Vehicle list should contain the motorcycle");
        assertTrue(vehicles.contains(truck), "Vehicle list should contain the truck");
    }
}
