package CreationalDesignPattern.SingletonDesignPattern;

public class Client {
    public static void main(String[] args) {

        // ❌ Compiler Error: Cannot do 'new President()' because constructor is private

        System.out.println("--- 1. Prime Minister meeting the President ---");
        President president1 = President.getInstance();
        president1.makeAnnouncement("Welcome to the G20 Summit!");
        System.out.println("President 1 HashCode: " + president1.hashCode());

        System.out.println("\n--- 2. Foreign Diplomat meeting the President ---");
        President president2 = President.getInstance();
        president2.makeAnnouncement("Signing a trade agreement.");
        System.out.println("President 2 HashCode: " + president2.hashCode());

        System.out.println("\n--- 3. Media interviewing the President ---");
        President president3 = President.getInstance();
        System.out.println("President 3 HashCode: " + president3.hashCode());

        System.out.println("\n========== VERIFICATION ==========");
        System.out.println("Is president1 == president2? " + (president1 == president2));
        System.out.println("Is president2 == president3? " + (president2 == president3));
        System.out.println("=> All officials interact with the EXACT SAME President instance!");
    }
}
