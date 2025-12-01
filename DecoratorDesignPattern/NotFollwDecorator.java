package DecoratorDesignPattern;

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
    /*
     * You already created 8 classes FOR JUST:
     * 
     * 2 Base pizzas
     * 
     * 2 Toppings
     * 
     * If you add Olives, Paneer, Corn, etc., classes will explode to 20, 40, 60…
     * This is the Class Explosion Problem.
     */
}
