package design.patterns.factory;

public class Car implements Vehicle {

    @Override
    public void create() {
        System.out.println("Creating car object");
    }

}
