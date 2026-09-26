package StructuralDesignPattern.CompositeDesignPattern;

public class FileItem implements FileSystemItem {
    private final String name;
    private final int size; // size in KB

    public FileItem(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "📄 File: " + name + " (" + size + " KB)");
    }

    @Override
    public int getSize() {
        return size;
    }
}
