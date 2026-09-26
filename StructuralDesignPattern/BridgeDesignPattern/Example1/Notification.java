package StructuralDesignPattern.BridgeDesignPattern.Example1;

// ============================================================================
// 3. ABSTRACTION (The Business Logic Hierarchy)
// ============================================================================
public abstract class Notification {
    // 🌉 THE BRIDGE: Composition reference to the Implementor hierarchy
    protected final MessageSender sender;

    public Notification(MessageSender sender) {
        this.sender = sender;
    }

    public abstract void notifyUser(String user, String message);
}
