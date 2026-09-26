package StructuralDesignPattern.BridgeDesignPattern.Example2;

abstract public class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();
}
