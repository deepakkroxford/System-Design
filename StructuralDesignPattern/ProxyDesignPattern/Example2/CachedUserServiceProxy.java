package StructuralDesignPattern.ProxyDesignPattern.Example2;

import java.util.*;

public class CachedUserServiceProxy implements UserService {
    private final UserService userService = new RealUserService();
    private final Map<Integer, String> cache = new HashMap<>();

    @Override
    public String getUserProfile(int userId) {
        if (cache.containsKey(userId)) {
            System.out.println("Getting user profile from cache for user: " + userId);
            return cache.get(userId);
        }
        String profile = userService.getUserProfile(userId);
        cache.put(userId, profile);
        return profile;
    }

}
