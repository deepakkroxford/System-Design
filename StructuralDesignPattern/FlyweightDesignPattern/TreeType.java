package StructuralDesignPattern.FlyweightDesignPattern;

// ============================================================================
// 1. FLYWEIGHT CLASS (Intrinsic State)
// Holds data that is shared, invariant, and heavy across multiple objects.
// ============================================================================
public class TreeType {
    // Intrinsic State (Shared among all trees of this type)
    private final String name;
    private final String color;
    private final String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public String getName() {
        return name;
    }

    // Extrinsic state (x, y, height) is passed in from outside via method parameters
    public void draw(int x, int y, int height) {
        System.out.println("Rendering [" + name + " Tree] (Color: " + color + 
                           ", Texture: " + texture + ") at coordinates (" + x + ", " + y + ") with height " + height + "m");
    }
}
