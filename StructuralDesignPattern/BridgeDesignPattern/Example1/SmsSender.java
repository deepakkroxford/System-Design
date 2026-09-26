package StructuralDesignPattern.BridgeDesignPattern.Example1;

// ============================================================================
// 2. CONCRETE IMPLEMENTORS (Specific platform implementations)
// ============================================================================
public class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("📱 [SMS Gateway] Sending SMS: " + message);
    }
}
