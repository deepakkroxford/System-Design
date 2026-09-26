package StructuralDesignPattern.CompositeDesignPattern;

public interface FileSystemItem {
    void showDetails(String indent);
    int getSize(); // in KB
}
