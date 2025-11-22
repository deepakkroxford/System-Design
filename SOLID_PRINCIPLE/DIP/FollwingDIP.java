package SOLID_PRINCIPLE.DIP;

interface Keyboard {
    void input();
}

class WiredKeyboard implements Keyboard {
    
    public void input() {
        System.out.println("Typing using Wired Keyboard");
    }
}

class WirelessKeyboard implements Keyboard {

    public void input() {
        System.out.println("Typing using Wireless Keyboard");
    }
}

class Computer {
    private Keyboard keyboard; //  depends on abstraction

    public Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void type() {
        keyboard.input();
    }
}

public class FollwingDIP {
    public static void main(String[] args) {
        Keyboard wired = new WiredKeyboard();
        Computer computer1 = new Computer(wired);
        computer1.type();

        Keyboard wireless = new WirelessKeyboard();
        Computer computer2 = new Computer(wireless);
        computer2.type();
    }
}
