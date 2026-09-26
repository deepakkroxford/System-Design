package StructuralDesignPattern.FlyweightDesignPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 🪶 FLYWEIGHT DESIGN PATTERN DEMO ===\n");

        Forest forest = new Forest();

        // 1. Planting multiple Oak trees (same intrinsic state, different coordinates)
        forest.plantTree(10, 20, 15, "Oak", "Dark Green", "Rough Bark 4K Texture");
        forest.plantTree(15, 30, 12, "Oak", "Dark Green", "Rough Bark 4K Texture");
        forest.plantTree(25, 45, 18, "Oak", "Dark Green", "Rough Bark 4K Texture");

        System.out.println("\n------------------------------------------------\n");

        // 2. Planting multiple Pine trees
        forest.plantTree(50, 60, 25, "Pine", "Emerald", "Needle Foliage 4K Texture");
        forest.plantTree(55, 70, 22, "Pine", "Emerald", "Needle Foliage 4K Texture");

        System.out.println("\n------------------------------------------------\n");

        // 3. Planting a Birch tree
        forest.plantTree(80, 90, 10, "Birch", "White & Green", "Paper Bark 4K Texture");

        // 4. Render all trees
        forest.renderForest();

        // 5. Memory footprint stats
        System.out.println("\n================ MEMORY STATS ================");
        System.out.println("Total Individual Trees in Forest (Contexts): " + forest.getTotalTrees());
        System.out.println("Total Shared TreeType Objects Created in RAM (Flyweights): " + TreeFactory.getTotalTreeTypesCreated());
        System.out.println("==============================================");
    }
}
