package design.patterns.factory;

public class Truck implements VehicleTypeInterface {

    @Override
    public void create() {
        System.out.println("Creating Truck object");
    }

}
