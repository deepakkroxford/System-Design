package CreationalDesignPattern.FactoryDesginPattern;

public class WhatsappNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending Whatsapp message through Whatsapp....");
    }

}
