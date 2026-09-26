package StructuralDesignPattern.ProxyDesignPattern.Example2;

public class User {
    public static void main(String[] args) {
        UserService userService = new CachedUserServiceProxy();

        System.out.println(userService.getUserProfile(1));
        System.out.println(userService.getUserProfile(1));
        System.out.println(userService.getUserProfile(1));

        System.out.println(userService.getUserProfile(2));
        System.out.println(userService.getUserProfile(3));
        System.out.println(userService.getUserProfile(2));
    }
}
