package design.patterns.abstractfactory;

public class LuxuryTruck implements Truck {

    @Override
    public void assemble() {
        System.out.println("Assembling a luxury truck.");
    }
    
}
