package design.patterns.factory;

public class Truck implements Vehicle {

    @Override
    public void create() {
        System.out.println("Creating Truck object");
    }

}
