package StructuralDesignPattern.BridgeDesignPattern.Example3;

public class Customer {
    public static void main(String[] args) {
        // Without Bridge Pattern:
        // Every combination requires its own dedicated concrete class.
        Car suvCar1 = new PetrolSuv();
        Car suvCar2 = new ElectricSuv();
        Car suvCar3 = new DieselSuv();

        Car hatchBackCar1 = new ElectricHatchBack();
        Car hatchBackCar2 = new PetrolHatchBack();
        Car hatchBackCar3 = new DieselHatchBack();

        Car sedan1 = new ElectricSedan();
        Car sedan2 = new PetrolSedan();
        Car sedan3 = new DieselSedan();

        suvCar1.drive();
        suvCar2.drive();
        suvCar3.drive();

        hatchBackCar1.drive();
        hatchBackCar2.drive();
        hatchBackCar3.drive();

        sedan1.drive();
        sedan2.drive();
        sedan3.drive();
    }
}
