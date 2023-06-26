package ch2.observer.weatherExample;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
