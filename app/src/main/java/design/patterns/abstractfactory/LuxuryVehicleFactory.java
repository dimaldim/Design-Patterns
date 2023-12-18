package design.patterns.abstractfactory;

public class LuxuryVehicleFactory implements VehicleFactory {

    @Override
    public Car createCar() {
        return new LuxuryCar();
    }

    @Override
    public Truck createTruck() {
        return new LuxuryTruck();
    }
}
