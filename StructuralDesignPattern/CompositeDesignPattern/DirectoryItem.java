package StructuralDesignPattern.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class DirectoryItem implements FileSystemItem {
    private final String name;
    private final List<FileSystemItem> children = new ArrayList<>();

    public DirectoryItem(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        children.add(item);
    }

    public void remove(FileSystemItem item) {
        children.remove(item);
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "📁 Directory: " + name + " [Total Size: " + getSize() + " KB]");
        for (FileSystemItem child : children) {
            child.showDetails(indent + "    "); // Recursively print children
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemItem child : children) {
            totalSize += child.getSize(); // Recursively calculate size
        }
        return totalSize;
    }
}
