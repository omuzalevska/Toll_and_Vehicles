package dev.omuzalevska.tollandvehicles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MotorcycleTest {
    @Test
    void testMotorcycleTollCalculation() {
        Motorcycle motorcycle = new Motorcycle("BIKE-456");
        assertEquals(50.0, motorcycle.calculateToll(), "Motorcycle toll should be $50");
    }
}
