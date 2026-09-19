package CreationalDesignPattern.FactoryDesginPattern;

public class NotificationFactory {
    public static Notification getNotification(String type) {
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("Notification type cannot be null or empty");
        }
        switch (type.toUpperCase()) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SmsNotification();
            case "WHATSAPP":
                return new WhatsappNotification();
            default:
                return null;
        }
    }
}
