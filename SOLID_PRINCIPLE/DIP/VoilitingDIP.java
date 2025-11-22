package SOLID_PRINCIPLE.DIP;


class WiredKeyboard {
    public void input() {
        System.out.println("Typing using Wired Keyboard");
    }
}

class Computer {
    private WiredKeyboard keyboard = new WiredKeyboard(); // tightly coupled

    public void type() {
        keyboard.input();
    }
}
public class VoilitingDIP {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.type();

    }
}
