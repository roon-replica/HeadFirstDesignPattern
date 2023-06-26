package ch2.observer.weatherExample;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature, humidity, pressure;
    private WeatherSubject weatherSubject;

    public CurrentConditionDisplay(WeatherSubject weatherSubject) {
        this.weatherSubject = weatherSubject;
        weatherSubject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void display() {
        System.out.printf("temperature: %f'c, humidity: %f,  pressure: %f \n", temperature, humidity, pressure);
    }
}
