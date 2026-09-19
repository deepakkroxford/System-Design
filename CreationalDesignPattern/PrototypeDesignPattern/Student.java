package CreationalDesignPattern.PrototypeDesignPattern;

public class Student implements Prototype {
    private String name;
    private int rollNo;
    private String school;

    // Default Constructor: Does the heavy/expensive work (DB query, loading configuration)
    public Student() {
        try {
            System.out.println("Loading heavy school data & curriculum from database (takes 2 seconds)...");
            Thread.sleep(2000); // Simulating heavy DB / network call
            this.school = "Oxford University";
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Fast Constructor used for cloning (No heavy DB work)
    public Student(String name, int rollNo, String school) {
        this.name = name;
        this.rollNo = rollNo;
        this.school = school;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    // Prototype pattern clone method
    @Override
    public Prototype clone() {
        // Fast in-memory copy using pre-loaded data
        return new Student(this.name, this.rollNo, this.school);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + ", school=" + school + "]";
    }
}
