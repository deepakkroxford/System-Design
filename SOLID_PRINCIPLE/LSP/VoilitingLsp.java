package SOLID_PRINCIPLE.LSP;
interface Bike {
    void accelerate();
    void brake();
    void turnOffEngine();
    void turnOnEngine();
}
class Motorcycle implements Bike {

    @Override
    public void accelerate() {
        System.out.println("Motorcycle is accelerating");
    }

    @Override
    public void brake() {
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
class Cycle implements Bike {

    @Override
    public void accelerate() {
        System.out.println("Cycle is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Cycle is braking");
    }

    @Override
    public void turnOffEngine() {
        // Violation of LSP: Cycle does not have an engine
        throw new UnsupportedOperationException("Cycle does not have an engine to turn off");
    }

    @Override
    public void turnOnEngine() {
        // Violation of LSP: Cycle does not have an engine
        throw new UnsupportedOperationException("Cycle does not have an engine to turn on");
    }
    
}
public class VoilitingLsp {
    public static void main(String[] args) {
        
        Bike myBike = new Motorcycle();
        myBike.turnOnEngine(); // Works fine
        myBike.accelerate();
        myBike.brake();
        myBike.turnOffEngine();

        Bike myCycle = new Cycle();
        myCycle.accelerate();
        myCycle.brake();
        myCycle.turnOnEngine(); // Throws UnsupportedOperationException 
    }
}
