package StructuralDesignPattern.DecoratorDesignPattern;

// 1. COMPONENT INTERFACE

interface Pizza {
    String getDescription();

    double getCost();
}

// 2. CONCRETE COMPONENTS (Base Pizzas)

class MargheritaPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }

    @Override
    public double getCost() {
        return 200.0;
    }
}

class FarmHousePizza implements Pizza {
    @Override
    public String getDescription() {
        return "FarmHouse Pizza";
    }

    @Override
    public double getCost() {
        return 300.0;
    }
}

// 3. BASE DECORATOR (Abstract: IS-A Pizza & HAS-A Pizza)
abstract class ToppingDecorator implements Pizza {
    // Reference to the wrapped component (Composition)
    protected final Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription(); // Default delegation
    }

    @Override
    public double getCost() {
        return pizza.getCost(); // Default delegation
    }
}

// 4. CONCRETE DECORATORS (Toppings)
class ExtraCheese extends ToppingDecorator {
    public ExtraCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Extra Cheese";
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
    public String getDescription() {
        return pizza.getDescription() + " + Fresh Olives";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 30.0;
    }
}

class MushroomTopping extends ToppingDecorator {
    public MushroomTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Button Mushrooms";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 40.0;
    }
}

// ============================================================================
// 5. CLIENT / TEST DEMO
// ============================================================================
public class Implementation {
    public static void main(String[] args) {
        System.out.println("=== 1. Customizing Margherita Pizza ===");
        Pizza margherita = new MargheritaPizza();
        System.out.println(margherita.getDescription() + " -> Rs." + margherita.getCost());

        // Decorate with Cheese
        margherita = new ExtraCheese(margherita);
        System.out.println(margherita.getDescription() + " -> Rs." + margherita.getCost());

        // Decorate with Olives
        margherita = new OlivesTopping(margherita);
        System.out.println(margherita.getDescription() + " -> Rs." + margherita.getCost());

        System.out.println("\n=== 2. Customizing FarmHouse Pizza (Inline Composition) ===");
        // Farmhouse + Extra Cheese + Olives + Mushrooms (All in one line)
        Pizza customFarmhouse = new MushroomTopping(
                new OlivesTopping(
                        new ExtraCheese(
                                new FarmHousePizza())));

        System.out.println(customFarmhouse.getDescription());
        System.out.println("Total Cost: Rs." + customFarmhouse.getCost());
    }
}
