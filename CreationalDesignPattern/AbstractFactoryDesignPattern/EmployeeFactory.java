package CreationalDesignPattern.AbstractFactoryDesignPattern;

public class EmployeeFactory {
    public static Employee getEmployee(EmployeeObjectCreation employeeObjectCreation) {
        return employeeObjectCreation.createEmployee();
    }

    /**
     * Here if we want we can make this class to interface EmployeeFactory and can
     * implement this interface in the AndroidFactory, IOSFactory and WebDevFactory
     * and can return the object of the EmployeeFactory from this method. so we do
     * not nedd of employeeObjectCreation interface for
     * creating the object.
     * 
     */

}
