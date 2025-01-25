package dev.omuzalevska.tollandvehicles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void testCarTollCalculation() {
        Car car = new Car("CAR-123");
        assertEquals(100.0, car.calculateToll(), "Car toll should be $100");
    }
}
