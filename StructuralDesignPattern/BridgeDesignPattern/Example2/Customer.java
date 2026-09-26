package StructuralDesignPattern.BridgeDesignPattern.Example2;

public class Customer {
    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Engine electricEngine = new ElectricEngines();
        Engine desialEngine = new DesialEngines();
        Engine hybridEngine = new HybridEngine();

        Car suvCar1 = new SuvCar(petrolEngine);
        Car suvCar2 = new SuvCar(electricEngine);
        Car suvCar3 = new SuvCar(desialEngine);
        Car suvCar4 = new SuvCar(hybridEngine);

        Car hatchBackCar1 = new HatchBackCar(electricEngine);
        Car hatchBackCar2 = new HatchBackCar(petrolEngine);
        Car hatchBackCar3 = new HatchBackCar(desialEngine);

        Car sedan1 = new Sedan(electricEngine);
        Car sedan2 = new Sedan(petrolEngine);
        Car sedan3 = new Sedan(desialEngine);

        suvCar1.drive();
        suvCar2.drive();
        suvCar3.drive();
        suvCar4.drive();

        hatchBackCar1.drive();
        hatchBackCar2.drive();
        hatchBackCar3.drive();

        sedan1.drive();
        sedan2.drive();
        sedan3.drive();

    }
}
