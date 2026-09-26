package StructuralDesignPattern.BridgeDesignPattern.Example2;

public class ElectricEngines implements Engine {

    @Override
    public void start() {
        System.out.println("Electric Engine started....");
    }

}
