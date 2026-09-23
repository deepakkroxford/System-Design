package StructuralDesignPattern.DecoratorDesignPattern;

public class SimpleCoffee implements Coffee {
    private double cost = 50.0;
    private String description = "Base Coffee";

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
