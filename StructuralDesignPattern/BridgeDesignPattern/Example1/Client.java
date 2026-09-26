package StructuralDesignPattern.BridgeDesignPattern.Example1;

public class Client {
    public static void main(String[] args) {
        System.out.println("=== 🌉 BRIDGE DESIGN PATTERN DEMO (Example 1) ===\n");

        // 1. Send Alert via SMS
        MessageSender sms = new SmsSender();
        Notification alertViaSms = new AlertNotification(sms);
        alertViaSms.notifyUser("John", "Server CPU usage is above 95%!");

        // 2. Send Alert via Email (Same abstraction, different implementor!)
        MessageSender email = new EmailSender();
        Notification alertViaEmail = new AlertNotification(email);
        alertViaEmail.notifyUser("Admin", "Database connection timeout detected.");

        System.out.println("\n------------------------------------------------\n");

        // 3. Send Promotion via SMS
        Notification promoViaSms = new PromotionalNotification(sms);
        promoViaSms.notifyUser("Alice", "Flat 50% Off on all electronics today!");

        // 4. Send Promotion via Email
        Notification promoViaEmail = new PromotionalNotification(email);
        promoViaEmail.notifyUser("Bob", "Your favorite sneakers are back in stock!");
    }
}
