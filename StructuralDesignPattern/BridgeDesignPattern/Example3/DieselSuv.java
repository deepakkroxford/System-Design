package StructuralDesignPattern.BridgeDesignPattern.Example3;

public class DieselSuv extends Car {
    @Override
    public void drive() {
        System.out.println("SuvCar drive....");
        System.out.println("Diesel Engine started....");
    }
}
