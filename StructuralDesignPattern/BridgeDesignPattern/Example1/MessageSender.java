package StructuralDesignPattern.BridgeDesignPattern.Example1;

// ============================================================================
// 1. IMPLEMENTOR INTERFACE (The Implementation Hierarchy)
// ============================================================================
public interface MessageSender {
    void sendMessage(String message);
}
