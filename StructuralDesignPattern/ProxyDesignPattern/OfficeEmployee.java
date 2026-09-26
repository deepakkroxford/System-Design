package StructuralDesignPattern.ProxyDesignPattern;

public class OfficeEmployee {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("stackoverflow.com"); // ✅ ALLOWED
            internet.connectTo("facebook.com"); // ⛔ BLOCKED
            internet.connectTo("google.com"); // ✅ ALLOWED
            internet.connectTo("youtube.com"); // ⛔ BLOCKED
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
