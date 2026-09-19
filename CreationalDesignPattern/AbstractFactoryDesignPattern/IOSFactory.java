package CreationalDesignPattern.AbstractFactoryDesignPattern;

public class IOSFactory implements EmployeeObjectCreation {

    @Override
    public Employee createEmployee() {
        return new IOSDeveloper();
    }

}
