package BehavioralDesignPattern.StrategyDesignPattern;

class Vehicle {
    public void drive() {
        System.out.println("Drive method" + this.getClass().getSimpleName());
    }
}

class SportsCar extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a Sports Car");
    }
}

class EvCar extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving an Electric Car");
    }
}

class Truck extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a Truck");
    }
}

public class WithoutStrategyPattern {
    public static void main(String[] args) {
        Vehicle sportsCar = new SportsCar();
        sportsCar.drive();

        Vehicle evCar = new EvCar();
        evCar.drive();

        Vehicle truck = new Truck();
        truck.drive();
    }
}
