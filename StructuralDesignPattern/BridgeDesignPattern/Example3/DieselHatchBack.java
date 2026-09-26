package StructuralDesignPattern.BridgeDesignPattern.Example3;

public class DieselHatchBack extends Car {
    @Override
    public void drive() {
        System.out.println("HatchBackCar drive....");
        System.out.println("Diesel Engine started....");
    }
}
