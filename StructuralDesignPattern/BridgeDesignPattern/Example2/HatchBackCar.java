package StructuralDesignPattern.BridgeDesignPattern.Example2;

public class HatchBackCar extends Car {

    public HatchBackCar(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.println("HatchBackCar drive....");
        engine.start();
    }
}
