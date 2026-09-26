package StructuralDesignPattern.BridgeDesignPattern.Example3;

public class PetrolSedan extends Car {
    @Override
    public void drive() {
        System.out.println("Sedan Car drive....");
        System.out.println("Petrol Engine started....");
    }
}
