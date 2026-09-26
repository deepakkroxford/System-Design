package StructuralDesignPattern.BridgeDesignPattern.Example3;

public class PetrolSuv extends Car {
    @Override
    public void drive() {
        System.out.println("SuvCar drive....");
        System.out.println("Petrol Engine started....");
    }
}
