package StructuralDesignPattern.ProxyDesignPattern;

import java.util.List;

public class ProxyInternet implements Internet {

    private final Internet realInternet = new RealInternet();

    // Banned / Restricted websites in office/college
    private static final List<String> BANNED_SITES = List.of(
            "facebook.com",
            "instagram.com",
            "torrent.com",
            "gaming.com");

    @Override
    public void connectTo(String serverHost) throws Exception {
        // Intercept and check if website is banned
        if (BANNED_SITES.contains(serverHost.toLowerCase())) {
            throw new Exception("⛔ ACCESS BLOCKED: " + serverHost + " is restricted by network policy!");
        }
        // If allowed, forward request to the real internet
        realInternet.connectTo(serverHost);
    }
}
