package CreationalDesignPattern.PrototypeDesignPattern;

public class Client {
    public static void main(String[] args) {

        System.out.println("========== 1. CREATING ORIGINAL PROTOTYPE (HEAVY WORK) ==========");
        long start = System.currentTimeMillis();
        
        // This constructor runs the heavy DB loading once (~2000 ms)
        Student prototypeStudent = new Student();
        
        long end = System.currentTimeMillis();
        System.out.println("Original Prototype created in: " + (end - start) + " ms\n");

        System.out.println("========== 2. CLONING OBJECTS (FAST IN-MEMORY COPY) ==========");

        // Clone 1: Deepak (Takes 0 ms, heavy work is NOT repeated)
        long clone1Start = System.currentTimeMillis();
        Student student1 = (Student) prototypeStudent.clone();
        student1.setName("Deepak");
        student1.setRollNo(101);
        long clone1End = System.currentTimeMillis();
        System.out.println("Student 1 cloned in: " + (clone1End - clone1Start) + " ms");
        System.out.println(student1);

        // Clone 2: Rahul (Takes 0 ms, heavy work is NOT repeated)
        long clone2Start = System.currentTimeMillis();
        Student student2 = (Student) prototypeStudent.clone();
        student2.setName("Rahul");
        student2.setRollNo(102);
        long clone2End = System.currentTimeMillis();
        System.out.println("\nStudent 2 cloned in: " + (clone2End - clone2Start) + " ms");
        System.out.println(student2);
    }
}
