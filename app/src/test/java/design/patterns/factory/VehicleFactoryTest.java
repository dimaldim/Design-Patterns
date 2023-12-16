package design.patterns.factory;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class VehicleFactoryTest {

    @Test
    public void testFactoryPattern() {
        VehicleFactory vehicleFactory = new VehicleFactory();

        // Test for valid vehicle types
        Vehicle vehicle1 = vehicleFactory.getVehicle("CAR");
        assertTrue(vehicle1 instanceof Car);

        Vehicle vehicle2 = vehicleFactory.getVehicle("TRUCK");
        assertTrue(vehicle2 instanceof Truck);
    }

    @Test
    public void testFactoryPatternWithInvalidType() {
        VehicleFactory vehicleFactory = new VehicleFactory();

        // Test for invalid vehicle type
        assertThrows(IllegalArgumentException.class, () -> {
            vehicleFactory.getVehicle("BIKE");
        });
    }

    @Test
    public void testFactoryPatternWithNullType() {
        VehicleFactory vehicleFactory = new VehicleFactory();

        // Test for null as vehicle type
        assertThrows(IllegalArgumentException.class, () -> {
            vehicleFactory.getVehicle(null);
        });
    }
}
