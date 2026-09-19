package CreationalDesignPattern.AbstractFactoryDesignPattern;

public class AndroidFactory implements EmployeeObjectCreation {
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
