package CreationalDesignPattern.AbstractFactoryDesignPattern;

/**
 * AndroidDeveloper
 */
public class AndroidDeveloper implements Employee {

    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name() {
        return "Android Developer";
    }
}