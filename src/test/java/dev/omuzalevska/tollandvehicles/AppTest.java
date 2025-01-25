package dev.omuzalevska.tollandvehicles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.*;
// import org.junit.jupiter.api.Test;
// import java.io.ByteArrayOutputStream;
// import java.io.PrintStream;

class AppTest {

    @Test
    void testAppFunctionality() {
        TollStation station = new TollStation("Central Toll", "Kyiv");

        station.processVehicle(new Car("ABC-123"));
        station.processVehicle(new Motorcycle("DEF-456"));
        station.processVehicle(new Truck("GHI-789", 3)); // 3 axles

        // Check total toll collected
        assertEquals(300.0, station.getTotalTollCollected(), "Total toll should be $350");

        // Check vehicle count
        assertEquals(3, station.getVehicles().size(), "Should process 3 vehicles");
    }

//     @Test
//     void testAppOutput() {
//         TollStation station = new TollStation("Central Toll", "Kyiv");
//         station.processVehicle(new Car("ABC-123"));
//         station.processVehicle(new Motorcycle("DEF-456"));
//         station.processVehicle(new Truck("GHI-789", 3));

//         ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//         System.setOut(new PrintStream(outContent));

//         station.printReport();

//         String expectedOutput = """
//                 Toll Station: Central Toll, City: Kyiv
//                 Vehicles processed:
//                 Car - License Plate: ABC-123
//                 Motorcycle - License Plate: DEF-456
//                 Truck - License Plate: GHI-789, Axles: 3
//                 Total Toll Collected: $300.0
//                 """;

//         assertEquals(expectedOutput.trim(), outContent.toString().trim());

//         System.setOut(System.out);
//     }
}

