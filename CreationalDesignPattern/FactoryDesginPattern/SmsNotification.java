package CreationalDesignPattern.FactoryDesginPattern;

public class SmsNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending Sms through Sms....");
    }

}
