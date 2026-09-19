package CreationalDesignPattern.SingletonDesignPattern;

public class President {

    // Step 1: Private static variable to hold the single President instance
    private static volatile President instance;

    private String name;

    // Step 2: Private constructor prevents creating multiple President instances using 'new'
    private President() {
        this.name = "Droupadi Murmu";
        System.out.println("Swearing in the President of India (Instance Created Only Once!)...");
    }

    // Step 3: Public static method to provide global access to the single President (Thread-safe)
    public static President getInstance() {
        if (instance == null) {
            synchronized (President.class) {
                if (instance == null) {
                    instance = new President();
                }
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeAnnouncement(String message) {
        System.out.println("President " + name + " announces: " + message);
    }
}
