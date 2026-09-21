package StructuralDesignPattern.DecoratorDesignPattern;

// This one demonstrates the Decorator Design Pattern
interface Pizza {
    String getDiscription();

    double getCost();
}

// Basic Pizza implementations
class Margherita implements Pizza {

    @Override
    public String getDiscription() {
        return "Margherita Pizza";
    }

    @Override
    public double getCost() {
        return 200.0;
    }
}

// Another basic pizza implementation
class FarmHouse implements Pizza {

    @Override
    public String getDiscription() {
        return "FarmHouse Pizza";
    }

    @Override
    public double getCost() {
        return 300.0;
    }
}

// Topping Decorator
abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}

class CheeseTopping extends ToppingDecorator {

    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDiscription() {
        return pizza.getDiscription() + ", Cheese Topping";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 50.0;
    }
}

class OlivesTopping extends ToppingDecorator {

    public OlivesTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDiscription() {
        return pizza.getDiscription() + ", Olives Topping";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 30.0;
    }
}

public class Implementation {
    public static void main(String[] args) {
        Pizza pizza = new Margherita();
        System.out.println(pizza.getDiscription() + " | Cost: " + pizza.getCost());

        // Adding Cheese Topping
        pizza = new CheeseTopping(pizza);
        System.out.println(pizza.getDiscription() + " | Cost: " + pizza.getCost());

        // Adding Olives Topping
        pizza = new OlivesTopping(pizza);
        System.out.println(pizza.getDiscription() + " | Cost: " + pizza.getCost());
    }
}
