package StructuralDesignPattern.BridgeDesignPattern.Example1;

// ============================================================================
// 2. CONCRETE IMPLEMENTORS (Specific platform implementations)
// ============================================================================
public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("📧 [Email Gateway] Sending: " + message);
    }
}
