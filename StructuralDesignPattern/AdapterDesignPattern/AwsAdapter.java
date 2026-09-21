package StructuralDesignPattern.AdapterDesignPattern;

public class AwsAdapter implements NotificationSender {
    private AwsSesService awsSesService;

    public AwsAdapter(AwsSesService awsSesService) {
        this.awsSesService = awsSesService;
    }

    @Override
    public void send(String recipentEmail, String subject, String messageBody) {
        // Combine subject and body into one string (AWS SDK requirement)
        String combinedPayload = "Subject: " + subject + "\nBody: " + messageBody;

        // Call AWS SDK method
        awsSesService.sendEmail(recipentEmail, combinedPayload);
    }
}
