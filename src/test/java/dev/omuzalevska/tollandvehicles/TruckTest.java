package dev.omuzalevska.tollandvehicles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TruckTest {
    @Test
    void testTruckTollCalculation() {
        Truck truck = new Truck("TRUCK-789", 3);
        assertEquals(150.0, truck.calculateToll(), "Truck with 3 axles should have toll $150");
    }

    @Test
    void testTruckWithZeroAxles() {
        Truck truck = new Truck("TRUCK-000", 0);

        assertEquals(0.0, truck.calculateToll(), "Toll for truck with 0 axles should be $0");
    }
}
