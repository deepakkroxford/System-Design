package StructuralDesignPattern.AdapterDesignPattern;

public class EmailSending implements NotificationSender {

    @Override
    public void send(String recipentEmail, String subject, String messageBody) {

        System.out.println("--- [Email Service] ---");
        System.out.println("Sending to: " + recipentEmail);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + messageBody);
        System.out.println("---------------------");

    }

}
