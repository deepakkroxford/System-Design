package StructuralDesignPattern.DecoratorDesignPattern;

class CaramelDecorator extends CoffeeDecorator {

    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + "  , Caramel ";
    }

}
