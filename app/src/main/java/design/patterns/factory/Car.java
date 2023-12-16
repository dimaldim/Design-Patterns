package design.patterns.factory;

public class Car implements VehicleTypeInterface {

    @Override
    public void create() {
        System.out.println("Creating car object");
    }

}
