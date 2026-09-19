package CreationalDesignPattern.FactoryDesginPattern;

import java.util.Scanner;

/**
 * Client
 */
public class Client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: Email, Sms, Whatsapp");
        String choice = sc.nextLine();

        Notification notification = NotificationFactory.getNotification(choice);
        notification.send("Hello");

        /**
         * Issue is if we need to add a new notification type, we have to modify the
         * code this is against the open-closed principle because it is closed for the
         * modifications but open for the extension we can add new notification
         * types but we cannot modify the existing code
         */

        // switch (choice) {
        // case 1:
        // notification = new EmailNotification();
        // notification.send("Hello");
        // break;
        // case 2:
        // notification = new SmsNotification();
        // notification.send("Hello");
        // break;
        // case 3:
        // notification = new WhatsappNotification();
        // notification.send("Hello");
        // break;
        // default:
        // System.out.println("Invalid choice");
        // break;
        // }

        sc.close();
    }
}