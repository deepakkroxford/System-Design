package CreationalDesignPattern.AbstractFactoryDesignPattern;

public class Client {
    public static void main(String[] args) {

        Employee e1 = EmployeeFactory.getEmployee(new AndroidFactory());
        System.out.println(e1.name() + " " + e1.salary());

        Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
        System.out.println(e2.name() + " " + e2.salary());

        Employee e3 = EmployeeFactory.getEmployee(new IOSFactory());
        System.out.println(e3.name() + " " + e3.salary());

        /**
         * 
         * if we remove the extra interface for creating the object then we can
         * implement like this.
         * EmployeeFactory androidFactory = new AndroidFactory();
         * Employee e1 = androidFactory.createEmployee();
         * System.out.println(e1.name() + " " + e1.salary());
         * EmployeeFactory iosFactory = new IOSFactory();
         * Employee e2 = iosFactory.createEmployee();
         * System.out.println(e2.name() + " " + e2.salary());
         * 
         * 
         */
    }
}
