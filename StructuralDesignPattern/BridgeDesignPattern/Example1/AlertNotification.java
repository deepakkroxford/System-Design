package StructuralDesignPattern.BridgeDesignPattern.Example1;

// ============================================================================
// 4. REFINED ABSTRACTION 1 (Urgent/Critical Notification)
// ============================================================================
public class AlertNotification extends Notification {

    public AlertNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String user, String message) {
        // High priority formatting
        String formattedMessage = "[🚨 CRITICAL ALERT for " + user + "]: " + message;
        sender.sendMessage(formattedMessage);
    }
}
