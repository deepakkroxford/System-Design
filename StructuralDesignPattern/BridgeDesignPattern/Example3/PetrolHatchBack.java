package StructuralDesignPattern.BridgeDesignPattern.Example3;

public class PetrolHatchBack extends Car {
    @Override
    public void drive() {
        System.out.println("HatchBackCar drive....");
        System.out.println("Petrol Engine started....");
    }
}
