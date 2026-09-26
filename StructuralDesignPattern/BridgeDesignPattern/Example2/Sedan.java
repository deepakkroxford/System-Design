package StructuralDesignPattern.BridgeDesignPattern.Example2;

public class Sedan extends Car {

    public Sedan(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.println("Sedan Car drive....");
        engine.start();
    }

}
