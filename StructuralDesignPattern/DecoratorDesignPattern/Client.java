package StructuralDesignPattern.DecoratorDesignPattern;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = new CaramelDecorator(new SimpleCoffee());
        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());

        Coffee coffee2 = new MilkDecorator(new CaramelDecorator(new SimpleCoffee()));
        System.out.println(coffee2.getCost());
        System.out.println(coffee2.getDescription());

        Coffee coffee3 = new SugarDecorator(new MilkDecorator(new CaramelDecorator(new SimpleCoffee())));
        System.out.println(coffee3.getCost());
        System.out.println(coffee3.getDescription());

    }
}
