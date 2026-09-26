package StructuralDesignPattern.BridgeDesignPattern.Example3;

public class ElectricHatchBack extends Car {
    @Override
    public void drive() {
        System.out.println("HatchBackCar drive....");
        System.out.println("Electric Engine started....");
    }
}
