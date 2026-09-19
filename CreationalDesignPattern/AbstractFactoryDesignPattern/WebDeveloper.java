package CreationalDesignPattern.AbstractFactoryDesignPattern;

public class WebDeveloper implements Employee {

    @Override
    public int salary() {
        return 60000;
    }

    @Override
    public String name() {
        return "Web Developer";
    }
}
