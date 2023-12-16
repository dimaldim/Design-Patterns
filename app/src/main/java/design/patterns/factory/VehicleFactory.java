package design.patterns.factory;

public class VehicleFactory {

    public Vehicle getVehicle(String type) throws IllegalArgumentException {

        if (type == null) {
            throw new IllegalArgumentException("Type of vehicle cannot be null");
        }

        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if(type.equalsIgnoreCase("truck")) {
            return new Truck();
        }

        throw new IllegalArgumentException("Unknown type of vehicle " + type);
    }
}