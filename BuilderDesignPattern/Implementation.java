package BuilderDesignPattern;

class Employee {

    private String name;
    private String department;
    private String role;
    private double salary;
    private String location;
    private int phone;

    public Employee(Builder builder) {
        this.name = builder.name;
        this.department = builder.department;
        this.role = builder.role;
        this.salary = builder.salary;
        this.location = builder.location;
        this.phone = builder.phone;
    }


    @Override
    public String toString() {
        return "Employee{" + name + " "  + ", dept=" + department + 
               ", designation=" + role + ", salary= " + salary + ", location= "+ location+ ", phone= " + phone + "}";
    }

    static class Builder {
        private String name;
        private String department;
        private String role;
        private double salary;
        private String location;
        private int phone;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

         public Builder department(String department) {
            this.department = department;
            return this;   // returning 'this' enables chaining
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }

         public Builder role(String role) {
            this.role= role;
            return this;
        }


        public Builder phone(int phone) {
            this.phone = phone;
            return this;
        }

        public Employee build() {
            // validation before building
            if (salary < 0) {
                throw new IllegalArgumentException("Salary cannot be negative");
            }
            return new Employee(this);
        }

    }

}



public class Implementation {
        public static void main(String[] args) {

            Employee e = new Employee.Builder()
                            .department("ise")
                            .name("Deepak Kumar Singh")
                            .location("bengaluru")
                            .salary(3344344)
                            .role("SDE I")
                            .phone(62367274)
                            .build();

        System.out.println(e);
    }
}
