package StructuralDesignPattern.DecoratorDesignPattern;

class MargheritaPizza {
    public String getDescription() {
        return "Margherita";
    }

    public double getCost() {
        return 150;
    }
}

class FarmhousePizza {
    public String getDescription() {
        return "Farmhouse";
    }

    public double getCost() {
        return 200;
    }
}

class MargheritaCheesePizza {
    public String getDescription() {
        return "Margherita + Cheese";
    }

    public double getCost() {
        return 150 + 40;
    }
}

class MargheritaMushroomPizza {
    public String getDescription() {
        return "Margherita + Mushroom";
    }

    public double getCost() {
        return 150 + 30;
    }
}

class MargheritaCheeseMushroomPizza {
    public String getDescription() {
        return "Margherita + Cheese + Mushroom";
    }

    public double getCost() {
        return 150 + 40 + 30;
    }
}

class FarmhouseCheesePizza {
    public String getDescription() {
        return "Farmhouse + Cheese";
    }

    public double getCost() {
        return 200 + 40;
    }
}

class FarmhouseMushroomPizza {
    public String getDescription() {
        return "Farmhouse + Mushroom";
    }

    public double getCost() {
        return 200 + 30;
    }
}

class FarmhouseCheeseMushroomPizza {
    public String getDescription() {
        return "Farmhouse + Cheese + Mushroom";
    }

    public double getCost() {
        return 200 + 40 + 30;
    }
}

public class NotFollwDecorator {
    public static void main(String[] args) {
        System.out.println("=== ❌ WITHOUT DECORATOR: OBJECT CREATION COMPLEXITY ===\n");

        // --------------------------------------------------------------------
        // PAIN POINT 1: No Common Type / Polymorphism
        // Every single combination requires a different, specific class type!
        // --------------------------------------------------------------------
        MargheritaPizza p1 = new MargheritaPizza();
        MargheritaCheesePizza p2 = new MargheritaCheesePizza();
        MargheritaMushroomPizza p3 = new MargheritaMushroomPizza();
        MargheritaCheeseMushroomPizza p4 = new MargheritaCheeseMushroomPizza();
        FarmhouseCheeseMushroomPizza p5 = new FarmhouseCheeseMushroomPizza();

        System.out.println(p1.getDescription() + " -> Rs." + p1.getCost());
        System.out.println(p2.getDescription() + " -> Rs." + p2.getCost());
        System.out.println(p3.getDescription() + " -> Rs." + p3.getCost());
        System.out.println(p4.getDescription() + " -> Rs." + p4.getCost());
        System.out.println(p5.getDescription() + " -> Rs." + p5.getCost());

        // --------------------------------------------------------------------
        // PAIN POINT 2: What if a customer wants "Double Cheese" or "Extra Olives"?
        // IMPOSSIBLE without creating another class: MargheritaDoubleCheesePizza!
        // --------------------------------------------------------------------
        // MargheritaDoubleCheesePizza p6 = new ??? (Class doesn't exist!)

        // --------------------------------------------------------------------
        // PAIN POINT 3: Runtime User Input Nightmare (UI Checkboxes)
        // If customer selects checkboxes in frontend (hasCheese, hasMushroom),
        // look at the disgusting if-else ladder needed just to create the object:
        // --------------------------------------------------------------------
        boolean wantsCheese = true;
        boolean wantsMushroom = true;
        String basePizzaType = "MARGHERITA";

        System.out.println("\n--- Complex If-Else Decision Tree Just To Create 1 Pizza ---");
        if (basePizzaType.equals("MARGHERITA")) {
            if (wantsCheese && wantsMushroom) {
                MargheritaCheeseMushroomPizza pizza = new MargheritaCheeseMushroomPizza();
                System.out.println("Created: " + pizza.getDescription());
            } else if (wantsCheese) {
                MargheritaCheesePizza pizza = new MargheritaCheesePizza();
                System.out.println("Created: " + pizza.getDescription());
            } else if (wantsMushroom) {
                MargheritaMushroomPizza pizza = new MargheritaMushroomPizza();
                System.out.println("Created: " + pizza.getDescription());
            } else {
                MargheritaPizza pizza = new MargheritaPizza();
                System.out.println("Created: " + pizza.getDescription());
            }
        }
        // Imagine this if-else with 10 toppings: 1,024 if-else branches!
    }
}
