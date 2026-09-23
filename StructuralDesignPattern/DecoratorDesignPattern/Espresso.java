package StructuralDesignPattern.DecoratorDesignPattern;

public class Espresso implements Coffee {
    private double cost = 50.0;
    private String description = "Espresso";

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
