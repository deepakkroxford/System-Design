package StructuralDesignPattern.FacadeDesignPattern;

public class FacadeMetting {
    Camera camera;
    Internet internet;
    Microphone microphone;

    public FacadeMetting() {
        camera = new Camera();
        internet = new Internet();
        microphone = new Microphone();
    }

    public void startMeeting() {
        camera.start();
        internet.connectToInternet();
        microphone.turnOn();
    }
}
