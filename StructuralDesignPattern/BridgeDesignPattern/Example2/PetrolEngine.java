package StructuralDesignPattern.BridgeDesignPattern.Example2;

public class PetrolEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Petrol Engine started....");
    }

}
