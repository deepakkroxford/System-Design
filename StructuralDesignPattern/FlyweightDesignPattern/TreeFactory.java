package StructuralDesignPattern.FlyweightDesignPattern;

import java.util.HashMap;
import java.util.Map;

// ============================================================================
// 2. FLYWEIGHT FACTORY
// Manages a pool/cache of Flyweight objects, ensuring they are shared & reused.
// ============================================================================
public class TreeFactory {
    // Cache pool storing unique Flyweight instances
    private static final Map<String, TreeType> treeTypeCache = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "_" + color + "_" + texture;
        
        if (!treeTypeCache.containsKey(key)) {
            System.out.println("⚙️ [Factory] Creating NEW TreeType Flyweight for: " + name);
            treeTypeCache.put(key, new TreeType(name, color, texture));
        } else {
            System.out.println("♻️ [Factory] Reusing EXISTING TreeType Flyweight from cache for: " + name);
        }
        
        return treeTypeCache.get(key);
    }

    public static int getTotalTreeTypesCreated() {
        return treeTypeCache.size();
    }
}
