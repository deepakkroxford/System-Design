package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

interface StockAvailabilityObservable {
    void addStockObserver(StockNotificationObserver observer);

    void removeStockObserver(StockNotificationObserver observer);

    void notifyStockObservers();

    boolean purchase(int quantity);

    void restock(int quantity);
}

class IphoneProductObservable implements StockAvailabilityObservable {

    private final List<StockNotificationObserver> stockObservers;
    private final String productId;
    private final String productName;
    private final double price;
    private int stockQuantity;

    public IphoneProductObservable(String productId, String productName, double price, int initialStock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = initialStock;
        stockObservers = new ArrayList<>();
    }

    @Override
    public void addStockObserver(StockNotificationObserver observer) {
        stockObservers.add(observer);
        System.out.println("[+] Observer added: " + observer.getUserId());
    }

    @Override
    public void removeStockObserver(StockNotificationObserver observer) {
        stockObservers.remove(observer);
        System.out.println("[-] Observer removed: " + observer.getUserId());
    }

    @Override
    public void notifyStockObservers() {

        // Notify only if stock is available and there are subscribers
        if (stockQuantity > 0 && !stockObservers.isEmpty()) {

            System.out.println("Notifying " + stockObservers.size() + " subscribers...");

            // Create a copy to avoid ConcurrentModificationException
            List<StockNotificationObserver> observersToNotify = new ArrayList<>(stockObservers);

            // Notify each subscriber
            for (StockNotificationObserver observer : observersToNotify) {
                observer.update(stockQuantity);
            }
        }
    }

    @Override
    public boolean purchase(int quantity) {
        // Check if required quantity is available
        if (stockQuantity >= quantity) {
            stockQuantity -= quantity; // Deduct purchased quantity
            System.out.println("PURCHASE SUCCESS: " + quantity + " units of "
                    + productName + " | Remaining stock: " + stockQuantity);
            return true;
        } else {
            System.out.println("PURCHASE FAILED: " + productName
                    + " is out of stock! | Available Quantity: " + stockQuantity);
            return false;
        }
    }

    @Override
    public void restock(int quantity) {
        // Check if product was out of stock before restocking
        boolean wasOutOfStock = (stockQuantity == 0);
        // Add new stock
        stockQuantity += quantity;
        System.out.println("RESTOCKED: " + productName
                + " | Added: " + quantity
                + " items | Current stock: " + stockQuantity);
        // Notify subscribers ONLY if product was previously unavailable
        if (wasOutOfStock && stockQuantity > 0) {
            notifyStockObservers();
        }
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
}

interface StockNotificationObserver {
    void update(int newStock);

    String getNotificationMethod();

    String getUserId();
}

class EmailNotificationObserver implements StockNotificationObserver {

    private final String userId;
    private final String emailAddress;

    public EmailNotificationObserver(String userId, String emailAddress) {
        this.userId = userId;
        this.emailAddress = emailAddress;
    }

    @Override
    public void update(int newStock) {
        System.out.println("📧 EMAIL to " + emailAddress
            + " | Product is back in stock! Quantity available: " + newStock);
        sendEmail();
    }

    // Simulates sending an email notification
    private void sendEmail() {
        System.out.println("📧 EMAIL SENT to: " + emailAddress
                + " | Product is back in stock! Hurry up!");
    }

    @Override
    public String getNotificationMethod() {
        return "Email";
    }

    @Override
    public String getUserId() {
        return userId;
    }
}

class PushNotificationObserver implements StockNotificationObserver {

    private final String userId;
    private final String deviceToken;

    public PushNotificationObserver(String userId, String deviceToken) {
        this.userId = userId;
        this.deviceToken = deviceToken;
    }

    @Override
    public void update(int newStock) {
         System.out.println("📱 PUSH to " + deviceToken
            + " | Product is back in stock! Quantity available: " + newStock);
        sendPushNotification();
    }

    // Simulates sending a push notification
    private void sendPushNotification() {
        System.out.println("📱 PUSH NOTIFICATION SENT to device: "
                + deviceToken + " | Product is back in stock! Hurry up!");
    }

    @Override
    public String getNotificationMethod() {
        return "Push Notification";
    }

    @Override
    public String getUserId() {
        return userId;
    }
}

public class EcommerceNotifyMe {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("###### E-commerce Store - Stock Availability Notification Feature Demo ######");
        System.out.println("------------------------------------------------------------");

        // Create an iPhone product with initial stock = 10 units
        StockAvailabilityObservable iphoneProduct = new IphoneProductObservable("ip15", "iPhone 15", 1250, 10);

        // Create observers (users)
        StockNotificationObserver John_PUSH = new PushNotificationObserver("John123", "JohnDeviceP1");

        StockNotificationObserver Katy_PUSH = new PushNotificationObserver("Katy678", "KatyDeviceP2");

        StockNotificationObserver Jane_EMAIL = new EmailNotificationObserver("Jane783", "jane783@gmail.com");

        StockNotificationObserver George_EMAIL = new EmailNotificationObserver("George993", "george993@gmail.com");

        // Black Friday Sale – Purchase all 10 units
        iphoneProduct.purchase(10);

        // Attempting to purchase again → Out of stock → Users subscribe for
        // notifications
        boolean success = iphoneProduct.purchase(1); // This will fail

        if (!success) {
            // Users subscribe for stock notifications
            iphoneProduct.addStockObserver(John_PUSH); // John
            iphoneProduct.addStockObserver(Katy_PUSH); // Katy
            iphoneProduct.addStockObserver(Jane_EMAIL); // Jane
            iphoneProduct.addStockObserver(George_EMAIL); // George
        }

        // Restock iPhone 15 → Notify all 4 users
        iphoneProduct.restock(20);

        // Users purchase after receiving notifications
        iphoneProduct.purchase(1); // John buys 1 unit
        iphoneProduct.purchase(1); // Katy buys 1 unit

        // John & Katy unsubscribe
        iphoneProduct.removeStockObserver(John_PUSH);
        iphoneProduct.removeStockObserver(Katy_PUSH);

        // New Year Sale – Sell remaining 18 units
        iphoneProduct.purchase(18);

        // Restock again → Only Jane & George are notified
        iphoneProduct.restock(5);

        // Jane & George purchase
        iphoneProduct.purchase(1); // Jane
        iphoneProduct.purchase(1); // George

        // Both unsubscribe
        iphoneProduct.removeStockObserver(Jane_EMAIL);
        iphoneProduct.removeStockObserver(George_EMAIL);
    }
}
