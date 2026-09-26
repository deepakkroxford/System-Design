package StructuralDesignPattern.BridgeDesignPattern.Example2;

public class SuvCar extends Car {

    public SuvCar(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.println("SuvCar drive....");
        engine.start();
    }
}
