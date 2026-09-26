package StructuralDesignPattern.ProxyDesignPattern.Example2;

public class RealUserService implements UserService {
    @Override
    public String getUserProfile(int userId) {
        // Fetching user profile from database (heavy operation)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "User Profile: " + userId;
    }
}
