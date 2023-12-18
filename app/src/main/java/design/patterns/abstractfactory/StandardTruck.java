package design.patterns.abstractfactory;

public class StandardTruck implements Truck {

    @Override
    public void assemble() {
        System.out.println("Assembling a standard truck.");
    }
    
}
