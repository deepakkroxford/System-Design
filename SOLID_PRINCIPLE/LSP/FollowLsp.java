package SOLID_PRINCIPLE.LSP;

interface Engine {
    void turnOffEngine();

    void turnOnEngine();
}

abstract class Bike {
    abstract void accelerate();

    abstract void brake();
}
class Motorcycle extends Bike implements Engine {

    @Override
    void accelerate() {
        System.out.println("Motorcycle is accelerating");
    }

    @Override
    void brake() {
        System.out.println("Motorcycle is braking");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("Motorcycle engine turned off");
    }

    @Override
    public void turnOnEngine() {
        System.out.println("Motorcycle engine turned on");
    }

}
class Cycle extends Bike {

    @Override
    void accelerate() {
        System.out.println("Cycle is accelerating");
    }

    @Override
    void brake() {
        System.out.println("Cycle is braking");
    }

}
public class FollowLsp {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.accelerate();
        motorcycle.brake();
        motorcycle.turnOnEngine();
        motorcycle.turnOffEngine();

        Cycle cycle = new Cycle();
        cycle.accelerate();
        cycle.brake();

    }
}
