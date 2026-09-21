package BehavioralDesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

// Observable (Subject)
interface WeatherObservable {

    void addObserver(WeatherObserver observer);

    void removeObserver(WeatherObserver observer);

    void notifyObservers();

    void setWeatherReadings(float temperature, float humidity, float pressure);
}

class WeatherStation implements WeatherObservable {

    private final List<WeatherObserver> observers;
    // Weather data
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
        System.out.println("[+] Observer added: " + observer.getClass().getSimpleName());
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
        System.out.println("[-] Observer removed: " + observer.getClass().getSimpleName());
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(); // Notify each observer of the change that we have made while updating weather
                               // data
        }
    }

    @Override
    public void setWeatherReadings(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers(); // after setting new data, notify observers
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public String toString() {
        return "WeatherStation{temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure + '}';
    }
}

interface WeatherObserver {
    void update();
}

class CurrentConditionsDisplay implements WeatherObserver {

    private final WeatherObservable weatherStation;

    public CurrentConditionsDisplay(WeatherObservable weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Saving weather data...");
        display();
    }

    public void display() {
        System.out.println("Current Weather Conditions: " + weatherStation.toString());
    }
}

class ForecastDisplay implements WeatherObserver {

    private final WeatherObservable weatherStation;

    public ForecastDisplay(WeatherObservable weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Updating weather data for forecast analysis: " + weatherStation.toString());
        display();
    }

    public void display() {
        System.out.println(
                "Forecast Details: Showing rain chances, temperature trends, and other weather predictions...");
    }
}

public class Implementation {
    public static void main(String[] args) {
        System.out.println("###### Observer Design Pattern (Weather Station) ######");

        // Publisher or Observable
        WeatherObservable weatherStation = new WeatherStation();

        // We have two Observers
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherStation);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherStation);

        System.out.println("\n===>>> First Weather Update");
        weatherStation.setWeatherReadings(80, 65, 30.4f);

        System.out.println("\n===>>> Second Weather Update");
        weatherStation.setWeatherReadings(82, 70, 29.2f);

        // Remove one observer
        weatherStation.removeObserver(forecastDisplay);

        System.out.println("\n===>>> Third Weather Update");
        weatherStation.setWeatherReadings(70, 21, 29.2f);

    }
}
