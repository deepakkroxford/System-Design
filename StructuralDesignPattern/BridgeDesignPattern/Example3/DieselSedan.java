package StructuralDesignPattern.BridgeDesignPattern.Example3;

public class DieselSedan extends Car {
    @Override
    public void drive() {
        System.out.println("Sedan Car drive....");
        System.out.println("Diesel Engine started....");
    }
}
