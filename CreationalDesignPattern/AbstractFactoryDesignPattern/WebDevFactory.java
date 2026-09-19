package CreationalDesignPattern.AbstractFactoryDesignPattern;

public class WebDevFactory implements EmployeeObjectCreation {

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }

}
