package CreationalDesignPattern.AbstractFactoryDesignPattern;

public class IOSDeveloper implements Employee {

    @Override
    public int salary() {
        return 70000;
    }

    @Override
    public String name() {
        return "iOS Developer";
    }
}