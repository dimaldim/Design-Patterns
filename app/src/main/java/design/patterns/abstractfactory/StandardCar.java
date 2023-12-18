package design.patterns.abstractfactory;

public class StandardCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling a standard car.");
    }

}
