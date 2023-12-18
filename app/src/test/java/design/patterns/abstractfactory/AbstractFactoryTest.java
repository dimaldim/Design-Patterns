package design.patterns.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

    @Test
    public void testLuxuryVehicleFactory() {
        VehicleFactory factory = new LuxuryVehicleFactory();
        Car car = factory.createCar();
        Truck truck = factory.createTruck();

        assertTrue(car instanceof LuxuryCar);
        assertTrue(truck instanceof LuxuryTruck);
    }

    @Test
    public void testStandardVehicleFactory() {
        VehicleFactory factory = new StandardVehicleFactory();
        Car car = factory.createCar();
        Truck truck = factory.createTruck();

        assertTrue(car instanceof StandardCar);
        assertTrue(truck instanceof StandardTruck);
    }
}
