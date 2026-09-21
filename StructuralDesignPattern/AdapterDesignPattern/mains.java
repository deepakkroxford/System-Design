package StructuralDesignPattern.AdapterDesignPattern;

public class mains {
    public static void main(String[] args) {

        AwsSesService awsSesService = new AwsSesService();

        // Use our system via the standard interface
        NotificationSender notificationSender = new AwsAdapter(awsSesService);

        notificationSender.send("[EMAIL_ADDRESS]", "Hello", "This is a test email");

        NotificationSender notificationSender2 = new EmailSending();
        notificationSender2.send("[EMAIL_ADDRESS]", "Hello", "This is a test email");

    }
}
