package ch2.observer.weatherExample;

import lombok.Getter;

import java.util.List;

@Getter
public class WeatherSubject implements Subject {
    private final List<Observer> observerList;
    private WeatherData weatherData;

    public WeatherSubject(List<Observer> observerList, float temperature, float humidity, float pressure) {
        this.observerList = observerList;
        this.weatherData = new WeatherData(temperature, humidity, pressure);
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(o -> o.update(weatherData.temperature, weatherData.humidity, weatherData.pressure));
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void changeMeasurements(float temperature, float humidity, float pressure) {
        this.weatherData = new WeatherData(temperature, humidity, pressure);
    }

    public record WeatherData(float temperature, float humidity, float pressure) {
    }
}
