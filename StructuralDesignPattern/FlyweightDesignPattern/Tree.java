package StructuralDesignPattern.FlyweightDesignPattern;

// ============================================================================
// 3. CONTEXT CLASS (Extrinsic State)
// Represents an individual tree with unique coordinates, referencing the shared Flyweight.
// ============================================================================
public class Tree {
    // Extrinsic State (Unique to each individual tree instance)
    private final int x;
    private final int y;
    private final int height;

    // 🌉 Reference to the shared Flyweight (Intrinsic State)
    private final TreeType type;

    public Tree(int x, int y, int height, TreeType type) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.type = type;
    }

    public void draw() {
        // Delegates rendering to Flyweight, passing extrinsic state as parameters
        type.draw(x, y, height);
    }
}
