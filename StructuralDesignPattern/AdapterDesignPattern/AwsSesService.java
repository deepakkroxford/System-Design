package StructuralDesignPattern.AdapterDesignPattern;

public class AwsSesService {
    // AWS SDK requires recipient and ONE combined text payload (Subject + Body
    // merged)
    public void sendEmail(String toAddress, String rawEmailText) {
        System.out.println("--- [AWS SES SDK] ---");
        System.out.println("Sending to: " + toAddress);
        System.out.println("Payload:\n" + rawEmailText);
        System.out.println("---------------------");

    }
}
