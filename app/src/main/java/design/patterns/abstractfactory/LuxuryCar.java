package design.patterns.abstractfactory;

public class LuxuryCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling a luxury car.");
    }

}
