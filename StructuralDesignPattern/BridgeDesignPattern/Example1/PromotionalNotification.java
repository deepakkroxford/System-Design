package StructuralDesignPattern.BridgeDesignPattern.Example1;

// ============================================================================
// 4. REFINED ABSTRACTION 2 (Marketing/Promotional Notification)
// ============================================================================
public class PromotionalNotification extends Notification {

    public PromotionalNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String user, String message) {
        // Marketing styling
        String formattedMessage = "[🎉 SPECIAL OFFER for " + user + "]: " + message + " (Use Code: SAVE20)";
        sender.sendMessage(formattedMessage);
    }
}
