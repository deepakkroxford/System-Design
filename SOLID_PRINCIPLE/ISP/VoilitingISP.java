package SOLID_PRINCIPLE.ISP;
 // BAD EXAMPLE — Violates Interface Segregation Principle (ISP)
// Fat interface: forces all employees to implement all methods
 interface RestaurantEmployee {
    void prepareFood();
    void decideMenu();
    void serveFoodAndDrinks();
    void takeOrder();
    void cleanTheKitchen();
}

// Waiter is forced to implement methods it doesn’t need
class Waiter implements RestaurantEmployee {

    @Override
    public void takeOrder() {
        System.out.println("Taking order...");
    }

    @Override
    public void serveFoodAndDrinks() {
        System.out.println("Serving food and drinks...");
    }

    @Override
    public void prepareFood() {
        throw new AssertionError("Waiter cannot prepare food!");
    }

    @Override
    public void decideMenu() {
        throw new AssertionError("Waiter cannot decide the menu!");
    }

    @Override
    public void cleanTheKitchen() {
        throw new AssertionError("Waiter cannot clean the kitchen!");
    }
}
public class VoilitingISP {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.takeOrder();
        waiter.serveFoodAndDrinks();

        // These calls cause exceptions because the interface forced them
        waiter.prepareFood();
        waiter.decideMenu();
        waiter.cleanTheKitchen();
    }
}
