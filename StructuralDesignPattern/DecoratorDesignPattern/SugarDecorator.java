package StructuralDesignPattern.DecoratorDesignPattern;

/**
 * SugarDecorator
 */
public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "  , Sugar ";
    }
}