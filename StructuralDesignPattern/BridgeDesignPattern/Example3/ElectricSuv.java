package StructuralDesignPattern.BridgeDesignPattern.Example3;

public class ElectricSuv extends Car {
    @Override
    public void drive() {
        System.out.println("SuvCar drive....");
        System.out.println("Electric Engine started....");
    }
}
