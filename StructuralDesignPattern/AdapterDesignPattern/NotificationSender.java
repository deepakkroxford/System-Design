package StructuralDesignPattern.AdapterDesignPattern;

public interface NotificationSender {
    void send(String recipentEmail, String subject, String messageBody);
}
