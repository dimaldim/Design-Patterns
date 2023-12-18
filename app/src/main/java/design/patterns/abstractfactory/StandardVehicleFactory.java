package design.patterns.abstractfactory;

public class StandardVehicleFactory implements VehicleFactory {

    @Override
    public Car createCar() {
        return new StandardCar();
    }

    @Override
    public Truck createTruck() {
        return new StandardTruck();
    }

}
