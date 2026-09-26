package StructuralDesignPattern.CompositeDesignPattern;

public class Client {
    public static void main(String[] args) {
        // 1. Create Individual Files (Leaves)
        FileSystemItem file1 = new FileItem("resume.pdf", 200);
        FileSystemItem file2 = new FileItem("avatar.png", 800);
        FileSystemItem file3 = new FileItem("budget.xlsx", 500);
        FileSystemItem file4 = new FileItem("system_log.txt", 100);

        // 2. Create Sub-directories (Composites)
        DirectoryItem personalDocs = new DirectoryItem("PersonalDocs");
        personalDocs.add(file1);
        personalDocs.add(file2);

        DirectoryItem workDocs = new DirectoryItem("WorkDocs");
        workDocs.add(file3);

        // 3. Create Root Directory (Composite containing other Composites and Leaves)
        DirectoryItem rootDir = new DirectoryItem("Root");
        rootDir.add(personalDocs);
        rootDir.add(workDocs);
        rootDir.add(file4);

        // 4. Uniform Display & Aggregation
        System.out.println("=== 📂 COMPOSITE PATTERN: FILE SYSTEM HIERARCHY ===");
        rootDir.showDetails("");

        System.out.println("\n✅ Total Storage Used by Root: " + rootDir.getSize() + " KB");
    }
}
