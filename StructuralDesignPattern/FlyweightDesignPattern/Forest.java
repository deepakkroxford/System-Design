package StructuralDesignPattern.FlyweightDesignPattern;

import java.util.ArrayList;
import java.util.List;

// ============================================================================
// 4. CLIENT / CONTAINER CLASS
// Manages a large collection of Context objects.
// ============================================================================
public class Forest {
    private final List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, int height, String name, String color, String texture) {
        // Obtains shared Flyweight from Factory
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        // Creates a lightweight Context object
        Tree tree = new Tree(x, y, height, type);
        trees.add(tree);
    }

    public void renderForest() {
        System.out.println("\n--- 🌲 RENDERING FOREST (" + trees.size() + " Trees) ---");
        for (Tree tree : trees) {
            tree.draw();
        }
    }

    public int getTotalTrees() {
        return trees.size();
    }
}
