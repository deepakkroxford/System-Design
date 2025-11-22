package SOLID_PRINCIPLE.ISP;

// Separate interfaces based on specific responsibilities
interface FoodPreparer {
    void prepareFood();
}
interface MenuDecider {
    void decideMenu();
}
interface Server {
    void serveFoodAndDrinks();
    void takeOrder();
}
interface Cleaner {
    void cleanTheKitchen();
}

// Concrete classes implementing only what they need
class Chef implements FoodPreparer, MenuDecider {
    @Override
    public void prepareFood() {
        System.out.println("Chef is preparing food...");
    }

    @Override
    public void decideMenu() {
        System.out.println("Chef is deciding the menu...");
    }
}

class Waiter implements Server {
    @Override
    public void takeOrder() {
        System.out.println("Waiter is taking the order...");
    }

    @Override
    public void serveFoodAndDrinks() {
        System.out.println("Waiter is serving food and drinks...");
    }
}

class CleanerStaff implements Cleaner {

    @Override
    public void cleanTheKitchen() {
        System.out.println("Cleaning staff is cleaning the kitchen...");
    }
}

public class FollwoingISP {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.takeOrder();
        waiter.serveFoodAndDrinks();

        Chef chef = new Chef();
        chef.prepareFood();
        chef.decideMenu();

        CleanerStaff cleaner = new CleanerStaff();
        cleaner.cleanTheKitchen();
    }
}
