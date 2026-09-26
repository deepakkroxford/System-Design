package StructuralDesignPattern.BridgeDesignPattern.Example3;

public class ElectricSedan extends Car {
    @Override
    public void drive() {
        System.out.println("Sedan Car drive....");
        System.out.println("Electric Engine started....");
    }
}
